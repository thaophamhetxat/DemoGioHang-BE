//package demogiohangbe.controller;
//
//import demogiohangbe.model.BillProduct;
//import demogiohangbe.model.Product;
//import demogiohangbe.service.Impl.IProductService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.io.IOException;
//import java.util.HashMap;
//import java.util.Map;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//
//@WebServlet(urlPatterns = "/add-to-cart") // ?pid=1
//@RestController
//@RequestMapping("/api/products/")
//@CrossOrigin("*")
//public class AddToCartController {
//    @Autowired
//    IProductService iProductService;
//
////	ProductDao productDao = new ProductDaoImpl();//gia su co 1 class dao de truy van database du lieu
//
//
//    @GetMapping
//    public ResponseEntity<Product> AddToCart(@PathVariable long id, HttpServletRequest req, HttpServletResponse resp) {
//
//        HttpSession session = req.getSession();
//        Object object = session.getAttribute("cart");// luu tam vao session
//        if (object == null) {// tao moi
//            // Tao mat hang
//            BillProduct billProduct = new BillProduct();
//            billProduct.setProduct(product);
//            billProduct.setQuantity(1);
//            billProduct.setUnitPrice(product.getPrice());
//            // gio hang co nhieu mat hang
//            Map<String, BillProduct> map = new HashMap<>();
//            map.put(pId, billProduct);// them mat hang vao ds
//
//            session.setAttribute("cart", map);// luu tam vao session
//        } else {
//            Map<String, BillProduct> map = (Map<String, BillProduct>) obj;
//
//            BillProduct billProduct = map.get(pId);
//
//            if (billProduct == null) {
//                billProduct = new BillProduct();
//                billProduct.setProduct(product);
//                billProduct.setQuantity(1);
//                billProduct.setUnitPrice(product.getPrice());
//
//                map.put(pId, billProduct);
//            } else {
//
//                billProduct.setQuantity(billProduct.getQuantity() + 1);
//            }
//
//            session.setAttribute("cart", map);// luu tam vao session
//        }
//        return new ResponseEntity(products, HttpStatus.OK);
//        resp.sendRedirect(req.getContextPath() + "/cart");
//    }
//}
