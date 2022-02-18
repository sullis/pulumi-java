// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.managedservices.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class PlanResponse {
    /**
     * The plan name.
     * 
     */
    private final String name;
    /**
     * The product code.
     * 
     */
    private final String product;
    /**
     * The publisher ID.
     * 
     */
    private final String publisher;
    /**
     * The plan's version.
     * 
     */
    private final String version;

    @OutputCustomType.Constructor({"name","product","publisher","version"})
    private PlanResponse(
        String name,
        String product,
        String publisher,
        String version) {
        this.name = Objects.requireNonNull(name);
        this.product = Objects.requireNonNull(product);
        this.publisher = Objects.requireNonNull(publisher);
        this.version = Objects.requireNonNull(version);
    }

    /**
     * The plan name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The product code.
     * 
     */
    public String getProduct() {
        return this.product;
    }
    /**
     * The publisher ID.
     * 
     */
    public String getPublisher() {
        return this.publisher;
    }
    /**
     * The plan's version.
     * 
     */
    public String getVersion() {
        return this.version;
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
