package com.wit;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/requestDemo02")
public class RequestDemo02 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
    {
//        String method=req.getMethod();
//        //*****��ȡuri
//        String uri=req.getRequestURI();
//        //����������
//        String query=req.getQueryString();
//        //*****����·��
//        String contextPath=req.getContextPath();


    };

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {





    }
}
