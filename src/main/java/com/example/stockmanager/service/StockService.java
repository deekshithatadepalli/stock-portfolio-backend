package com.example.stockmanager.service;

import com.example.stockmanager.model.Stock;
import com.example.stockmanager.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockService {

    @Autowired
    private StockRepository stockRepository;

    public Stock addStock(Stock stock) {
        return stockRepository.save(stock);
    }

    public Stock updateStock(Long id, Stock updatedStock) {
        return stockRepository.findById(id)
                .map(stock -> {
                    stock.setSymbol(updatedStock.getSymbol());
                    stock.setName(updatedStock.getName());
                    stock.setBuyPrice(updatedStock.getBuyPrice());
                    stock.setCurrentPrice(updatedStock.getCurrentPrice());
                    stock.setQuantity(updatedStock.getQuantity());
                    return stockRepository.save(stock);
                })
                .orElseThrow(() -> new RuntimeException("Stock not found with id: " + id));
    }

    public void deleteStock(Long id) {
        stockRepository.deleteById(id);
    }

    public List<Stock> getAllStocks() {
        return stockRepository.findAll();
    }

    public Double calculatePortfolioValue() {
        return stockRepository.findAll().stream()
                .mapToDouble(stock -> stock.getCurrentPrice() * stock.getQuantity())
                .sum();
    }
}