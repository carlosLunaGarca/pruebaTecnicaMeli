package com.meli.cuponservice.Models;


import lombok.Getter;
import lombok.Setter;

import java.util.Objects;


@Getter
@Setter
public class Response<T> {
    private T Data;
    private boolean IsSuccess = true;
    private boolean IsWarning = true;
    private String Message = "";

    @Override
    public String toString() {
        return "Response{" +
                "Data=" + Data +
                ", IsSuccess=" + IsSuccess +
                ", IsWarning=" + IsWarning +
                ", Message='" + Message + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Response)) return false;
        Response<?> response = (Response<?>) o;
        return IsSuccess == response.IsSuccess && IsWarning == response.IsWarning && Objects.equals(Data, response.Data) && Objects.equals(Message, response.Message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Data, IsSuccess, IsWarning, Message);
    }
}
