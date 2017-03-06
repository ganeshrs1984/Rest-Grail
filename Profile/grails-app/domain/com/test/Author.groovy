package com.test

import grails.rest.Resource

@Resource(uri='/author')
class Author {
    static hasMany = [books:Book]
    String name
}
