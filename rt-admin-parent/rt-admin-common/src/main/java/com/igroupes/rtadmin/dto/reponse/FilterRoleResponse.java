package com.igroupes.rtadmin.dto.reponse;

import lombok.Data;

import java.util.List;

@Data
public class FilterRoleResponse {
   private List<FilterRoleResponseDetail> list;

    @Data
    public static class FilterRoleResponseDetail {
        private Long id ;
        private String name;
    }
}
