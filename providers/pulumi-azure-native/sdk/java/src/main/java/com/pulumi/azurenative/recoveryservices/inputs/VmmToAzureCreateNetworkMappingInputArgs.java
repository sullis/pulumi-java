// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Create network mappings input properties/behavior specific to Vmm to Azure Network mapping.
 * 
 */
public final class VmmToAzureCreateNetworkMappingInputArgs extends com.pulumi.resources.ResourceArgs {

    public static final VmmToAzureCreateNetworkMappingInputArgs Empty = new VmmToAzureCreateNetworkMappingInputArgs();

    /**
     * The instance type.
     * Expected value is 'VmmToAzure'.
     * 
     */
    @Import(name="instanceType")
      private final @Nullable Output<String> instanceType;

    public Output<String> instanceType() {
        return this.instanceType == null ? Codegen.empty() : this.instanceType;
    }

    public VmmToAzureCreateNetworkMappingInputArgs(@Nullable Output<String> instanceType) {
        this.instanceType = Codegen.stringProp("instanceType").output().arg(instanceType).getNullable();
    }

    private VmmToAzureCreateNetworkMappingInputArgs() {
        this.instanceType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VmmToAzureCreateNetworkMappingInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> instanceType;

        public Builder() {
    	      // Empty
        }

        public Builder(VmmToAzureCreateNetworkMappingInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceType = defaults.instanceType;
        }

        public Builder instanceType(@Nullable Output<String> instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public Builder instanceType(@Nullable String instanceType) {
            this.instanceType = Codegen.ofNullable(instanceType);
            return this;
        }        public VmmToAzureCreateNetworkMappingInputArgs build() {
            return new VmmToAzureCreateNetworkMappingInputArgs(instanceType);
        }
    }
}
