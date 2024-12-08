package br.com.mgo.springtest.service;

public interface IConverteDados {
    <T> T  obterDados(String json, Class<T> classe);
}
