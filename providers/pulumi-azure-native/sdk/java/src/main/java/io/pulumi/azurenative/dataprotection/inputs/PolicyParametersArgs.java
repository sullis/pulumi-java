// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.inputs;

import io.pulumi.azurenative.dataprotection.inputs.AzureOperationalStoreParametersArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Parameters in Policy
 * 
 */
public final class PolicyParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final PolicyParametersArgs Empty = new PolicyParametersArgs();

    /**
     * Gets or sets the DataStore Parameters
     * 
     */
    @InputImport(name="dataStoreParametersList")
      private final @Nullable Input<List<AzureOperationalStoreParametersArgs>> dataStoreParametersList;

    public Input<List<AzureOperationalStoreParametersArgs>> getDataStoreParametersList() {
        return this.dataStoreParametersList == null ? Input.empty() : this.dataStoreParametersList;
    }

    public PolicyParametersArgs(@Nullable Input<List<AzureOperationalStoreParametersArgs>> dataStoreParametersList) {
        this.dataStoreParametersList = dataStoreParametersList;
    }

    private PolicyParametersArgs() {
        this.dataStoreParametersList = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<AzureOperationalStoreParametersArgs>> dataStoreParametersList;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataStoreParametersList = defaults.dataStoreParametersList;
        }

        public Builder setDataStoreParametersList(@Nullable Input<List<AzureOperationalStoreParametersArgs>> dataStoreParametersList) {
            this.dataStoreParametersList = dataStoreParametersList;
            return this;
        }

        public Builder setDataStoreParametersList(@Nullable List<AzureOperationalStoreParametersArgs> dataStoreParametersList) {
            this.dataStoreParametersList = Input.ofNullable(dataStoreParametersList);
            return this;
        }
        public PolicyParametersArgs build() {
            return new PolicyParametersArgs(dataStoreParametersList);
        }
    }
}