package com.github.tamurashingo.herokuconnectspringboot.herokuconnectspringboot.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Lead {

    /** id */
    private Long id;

    /**
     * 外部ID
     * アプリ側はこの値がユニークになるように生成すること
     */
    private String externalId;

    /**
     * 名
     */
    private String firstName;

    /**
     * 姓
     */
    private String lastName;

}
