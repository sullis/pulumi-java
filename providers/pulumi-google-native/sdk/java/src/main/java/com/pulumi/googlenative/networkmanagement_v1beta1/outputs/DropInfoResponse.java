// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkmanagement_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DropInfoResponse {
    /**
     * @return Cause that the packet is dropped.
     * 
     */
    private final String cause;
    /**
     * @return URI of the resource that caused the drop.
     * 
     */
    private final String resourceUri;

    @CustomType.Constructor
    private DropInfoResponse(
        @CustomType.Parameter("cause") String cause,
        @CustomType.Parameter("resourceUri") String resourceUri) {
        this.cause = cause;
        this.resourceUri = resourceUri;
    }

    /**
     * @return Cause that the packet is dropped.
     * 
     */
    public String cause() {
        return this.cause;
    }
    /**
     * @return URI of the resource that caused the drop.
     * 
     */
    public String resourceUri() {
        return this.resourceUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DropInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cause;
        private String resourceUri;

        public Builder() {
    	      // Empty
        }

        public Builder(DropInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cause = defaults.cause;
    	      this.resourceUri = defaults.resourceUri;
        }

        public Builder cause(String cause) {
            this.cause = Objects.requireNonNull(cause);
            return this;
        }
        public Builder resourceUri(String resourceUri) {
            this.resourceUri = Objects.requireNonNull(resourceUri);
            return this;
        }        public DropInfoResponse build() {
            return new DropInfoResponse(cause, resourceUri);
        }
    }
}
