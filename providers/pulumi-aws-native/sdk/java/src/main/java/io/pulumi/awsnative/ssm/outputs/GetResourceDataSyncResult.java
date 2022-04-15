// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ssm.outputs;

import io.pulumi.awsnative.ssm.outputs.ResourceDataSyncSyncSource;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetResourceDataSyncResult {
    private final @Nullable ResourceDataSyncSyncSource syncSource;

    @CustomType.Constructor
    private GetResourceDataSyncResult(@CustomType.Parameter("syncSource") @Nullable ResourceDataSyncSyncSource syncSource) {
        this.syncSource = syncSource;
    }

    public Optional<ResourceDataSyncSyncSource> syncSource() {
        return Optional.ofNullable(this.syncSource);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourceDataSyncResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ResourceDataSyncSyncSource syncSource;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResourceDataSyncResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.syncSource = defaults.syncSource;
        }

        public Builder syncSource(@Nullable ResourceDataSyncSyncSource syncSource) {
            this.syncSource = syncSource;
            return this;
        }        public GetResourceDataSyncResult build() {
            return new GetResourceDataSyncResult(syncSource);
        }
    }
}
