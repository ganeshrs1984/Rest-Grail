package com.test

import grails.rest.Resource

@Resource(uri='/books')
class Book {
    static belongsTo = Author
    String title
}