// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class LinuxVirtualMachineScaleSetSourceImageReference {
    /**
     * @return Specifies the offer of the image used to create the virtual machines.
     * 
     */
    private final String offer;
    /**
     * @return Specifies the publisher of the image used to create the virtual machines.
     * 
     */
    private final String publisher;
    /**
     * @return Specifies the SKU of the image used to create the virtual machines.
     * 
     */
    private final String sku;
    /**
     * @return Specifies the version of the image used to create the virtual machines.
     * 
     */
    private final String version;

    @CustomType.Constructor
    private LinuxVirtualMachineScaleSetSourceImageReference(
        @CustomType.Parameter("offer") String offer,
        @CustomType.Parameter("publisher") String publisher,
        @CustomType.Parameter("sku") String sku,
        @CustomType.Parameter("version") String version) {
        this.offer = offer;
        this.publisher = publisher;
        this.sku = sku;
        this.version = version;
    }

    /**
     * @return Specifies the offer of the image used to create the virtual machines.
     * 
     */
    public String offer() {
        return this.offer;
    }
    /**
     * @return Specifies the publisher of the image used to create the virtual machines.
     * 
     */
    public String publisher() {
        return this.publisher;
    }
    /**
     * @return Specifies the SKU of the image used to create the virtual machines.
     * 
     */
    public String sku() {
        return this.sku;
    }
    /**
     * @return Specifies the version of the image used to create the virtual machines.
     * 
     */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinuxVirtualMachineScaleSetSourceImageReference defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String offer;
        private String publisher;
        private String sku;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(LinuxVirtualMachineScaleSetSourceImageReference defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.offer = defaults.offer;
    	      this.publisher = defaults.publisher;
    	      this.sku = defaults.sku;
    	      this.version = defaults.version;
        }

        public Builder offer(String offer) {
            this.offer = Objects.requireNonNull(offer);
            return this;
        }
        public Builder publisher(String publisher) {
            this.publisher = Objects.requireNonNull(publisher);
            return this;
        }
        public Builder sku(String sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public LinuxVirtualMachineScaleSetSourceImageReference build() {
            return new LinuxVirtualMachineScaleSetSourceImageReference(offer, publisher, sku, version);
        }
    }
}
