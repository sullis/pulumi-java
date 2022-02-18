// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.managedservices.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Plan details for the managed services.
 * 
 */
public final class PlanResponse extends io.pulumi.resources.InvokeArgs {

    public static final PlanResponse Empty = new PlanResponse();

    /**
     * The plan name.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The product code.
     * 
     */
    @InputImport(name="product", required=true)
    private final String product;

    public String getProduct() {
        return this.product;
    }

    /**
     * The publisher ID.
     * 
     */
    @InputImport(name="publisher", required=true)
    private final String publisher;

    public String getPublisher() {
        return this.publisher;
    }

    /**
     * The plan's version.
     * 
     */
    @InputImport(name="version", required=true)
    private final String version;

    public String getVersion() {
        return this.version;
    }

    public PlanResponse(
        String name,
        String product,
        String publisher,
        String version) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.product = Objects.requireNonNull(product, "expected parameter 'product' to be non-null");
        this.publisher = Objects.requireNonNull(publisher, "expected parameter 'publisher' to be non-null");
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
    }

    private PlanResponse() {
        this.name = null;
        this.product = null;
        this.publisher = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PlanResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String product;
        private String publisher;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(PlanResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.product = defaults.product;
    	      this.publisher = defaults.publisher;
    	      this.version = defaults.version;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProduct(String product) {
            this.product = Objects.requireNonNull(product);
            return this;
        }

        public Builder setPublisher(String publisher) {
            this.publisher = Objects.requireNonNull(publisher);
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }

        public PlanResponse build() {
            return new PlanResponse(name, product, publisher, version);
        }
    }
}
