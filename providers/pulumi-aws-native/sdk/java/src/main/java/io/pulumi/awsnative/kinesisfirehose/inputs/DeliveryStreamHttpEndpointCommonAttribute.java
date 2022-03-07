// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class DeliveryStreamHttpEndpointCommonAttribute extends io.pulumi.resources.InvokeArgs {

    public static final DeliveryStreamHttpEndpointCommonAttribute Empty = new DeliveryStreamHttpEndpointCommonAttribute();

    @InputImport(name="attributeName", required=true)
      private final String attributeName;

    public String getAttributeName() {
        return this.attributeName;
    }

    @InputImport(name="attributeValue", required=true)
      private final String attributeValue;

    public String getAttributeValue() {
        return this.attributeValue;
    }

    public DeliveryStreamHttpEndpointCommonAttribute(
        String attributeName,
        String attributeValue) {
        this.attributeName = Objects.requireNonNull(attributeName, "expected parameter 'attributeName' to be non-null");
        this.attributeValue = Objects.requireNonNull(attributeValue, "expected parameter 'attributeValue' to be non-null");
    }

    private DeliveryStreamHttpEndpointCommonAttribute() {
        this.attributeName = null;
        this.attributeValue = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamHttpEndpointCommonAttribute defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String attributeName;
        private String attributeValue;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamHttpEndpointCommonAttribute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributeName = defaults.attributeName;
    	      this.attributeValue = defaults.attributeValue;
        }

        public Builder setAttributeName(String attributeName) {
            this.attributeName = Objects.requireNonNull(attributeName);
            return this;
        }

        public Builder setAttributeValue(String attributeValue) {
            this.attributeValue = Objects.requireNonNull(attributeValue);
            return this;
        }
        public DeliveryStreamHttpEndpointCommonAttribute build() {
            return new DeliveryStreamHttpEndpointCommonAttribute(attributeName, attributeValue);
        }
    }
}