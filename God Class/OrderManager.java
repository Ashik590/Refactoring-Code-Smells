public class OrderManager {

    private PaymentProcessor paymentProcessor;
    private ShippingService shippingService;
    private EmailService emailService;
    private InvoiceService invoiceService;
    private OrderService orderService;

    public OrderManager(
            PaymentProcessor paymentProcessor,
            ShippingService shippingService,
            EmailService emailService,
            InvoiceService invoiceService,
            OrderService orderService
    ) {
        this.paymentProcessor = paymentProcessor;
        this.shippingService = shippingService;
        this.emailService = emailService;
        this.invoiceService = invoiceService;
        this.orderService = orderService;
    }

    public void createOrder(Order order) {
        orderService.createOrder(order);
    }

    public void processPayment(Order order) {
        paymentProcessor.process(order);
    }

    public void shipOrder(Order order) {
        shippingService.ship(order);
    }

    public void sendConfirmationEmail(Order order) {
        emailService.sendConfirmation(order);
    }

    public void calculateInvoice(Order order) {
        invoiceService.calculate(order);
    }
}