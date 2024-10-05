
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
    protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {

        String carName = request.getParameter("car-name");
        String carColor = request.getParameter("car-color");

        System.out.println(carName);
        System.out.println(carColor);

        Car car = new Car(carName,carColor);

        CarDao carDao = new CarDao();

        new CarDao().createCar(car);

        resp.sendRedirect("/find-all-cars");



    }

}