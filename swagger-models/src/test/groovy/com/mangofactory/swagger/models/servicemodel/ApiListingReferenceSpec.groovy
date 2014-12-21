package com.mangofactory.swagger.models.servicemodel

class ApiListingReferenceSpec extends InternalJsonSerializationSpec {

  final ApiListingReference apiListingReference = new ApiListingReference('/path', 'desc', 2)

  def "should serialize"() {
    expect:
      writePretty(apiListingReference) == """{
  "description" : "desc",
  "path" : "/path",
  "position" : 2
}"""

  }

  def "should pass coverage"() {
    expect:
      apiListingReference.getDescription()
      apiListingReference.getPath()
      apiListingReference.getPosition()
  }
}