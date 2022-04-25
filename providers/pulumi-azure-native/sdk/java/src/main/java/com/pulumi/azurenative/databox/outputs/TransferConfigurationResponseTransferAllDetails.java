// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databox.outputs;

import com.pulumi.azurenative.databox.outputs.TransferAllDetailsResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TransferConfigurationResponseTransferAllDetails {
    /**
     * @return Details to transfer all data.
     * 
     */
    private final @Nullable TransferAllDetailsResponse include;

    @CustomType.Constructor
    private TransferConfigurationResponseTransferAllDetails(@CustomType.Parameter("include") @Nullable TransferAllDetailsResponse include) {
        this.include = include;
    }

    /**
     * @return Details to transfer all data.
     * 
     */
    public Optional<TransferAllDetailsResponse> include() {
        return Optional.ofNullable(this.include);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransferConfigurationResponseTransferAllDetails defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable TransferAllDetailsResponse include;

        public Builder() {
    	      // Empty
        }

        public Builder(TransferConfigurationResponseTransferAllDetails defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.include = defaults.include;
        }

        public Builder include(@Nullable TransferAllDetailsResponse include) {
            this.include = include;
            return this;
        }        public TransferConfigurationResponseTransferAllDetails build() {
            return new TransferConfigurationResponseTransferAllDetails(include);
        }
    }
}
