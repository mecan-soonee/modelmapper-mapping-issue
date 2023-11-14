1. Clone this project repository.
2. Spring Tool Suite or any equivalent IDE -> Import Existing Maven Projects
3. Open ModelmapperMapIssueApplication.java
4. Run As... -> Java Application for a few times.

Observe that inconsistent mapping output as below:

Output 1:
{
  "id": 1000,
  "sku": "sku1000",
  "bundleXSelectionProductDetail": {
    "maxQuantity": 55,
    "bundleXSelectionProducts": [
      {
        "bundleProductId": 1,
        "bundleProductSku": "sku1"
      },
      {
        "bundleProductId": 2,
        "bundleProductSku": "sku2"
      }
    ]
  }
}


Output 2 (without bundleXSelectionProductDetail):
{
  "id": 1000,
  "sku": "sku1000"
}

Actual:
The bundleXSelectionProductDetail intermittently being mapped and not mapped.

Expected:
The bundleXSelectionProductDetail should always being mapped.