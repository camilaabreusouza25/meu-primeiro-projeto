
package com.aula.carstore;

import com.aula.carstore.model.Car;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/create-car")
public class CreateCarServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String carName = request.getParameter("car-name");
        String carColor = request.getParameter("car-color");

        System.out.println(carName);
        System.out.println(carColor);

        Car car = new Car();

        car.setCor(carColor);
        car.setName(carName);

        CarDao carDao = new CarDao();

        carDao.createCar(car);

        request.getRequestDispatcher("index.jsp").forward(request, response);

    }

}