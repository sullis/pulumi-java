// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * HyperVSite fabric specific details.
 * 
 */
public final class HyperVSiteDetailsResponse extends com.pulumi.resources.InvokeArgs {

    public static final HyperVSiteDetailsResponse Empty = new HyperVSiteDetailsResponse();

    /**
     * Gets the class type. Overridden in derived classes.
     * Expected value is 'HyperVSite'.
     * 
     */
    @Import(name="instanceType", required=true)
      private final String instanceType;

    public String instanceType() {
        return this.instanceType;
    }

    public HyperVSiteDetailsResponse(String instanceType) {
        this.instanceType = Codegen.stringProp("instanceType").arg(instanceType).require();
    }

    private HyperVSiteDetailsResponse() {
        this.instanceType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HyperVSiteDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String instanceType;

        public Builder() {
    	      // Empty
        }

        public Builder(HyperVSiteDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceType = defaults.instanceType;
        }

        public Builder instanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }        public HyperVSiteDetailsResponse build() {
            return new HyperVSiteDetailsResponse(instanceType);
        }
    }
}
