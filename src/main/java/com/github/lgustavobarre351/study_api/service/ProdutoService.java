package com.github.lgustavobarre351.study_api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.github.lgustavobarre351.study_api.model.Produto;


@Service
public class ProdutoService {
    private List<Produto> produtos = new ArrayList<>();
    private Long ID_PRODUTO = 1L;

    public Produto save(Produto produto) {
        produto.setId(ID_PRODUTO);
        return produto;
 } 
}
