// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ResourceMoveDetailsResponse {
    /**
     * Denotes whether move operation is in progress
     * 
     */
    private final @Nullable String operationInProgress;
    /**
     * Denotes the timeout of the operation to finish
     * 
     */
    private final @Nullable String operationInProgressLockTimeoutInUTC;

    @OutputCustomType.Constructor({"operationInProgress","operationInProgressLockTimeoutInUTC"})
    private ResourceMoveDetailsResponse(
        @Nullable String operationInProgress,
        @Nullable String operationInProgressLockTimeoutInUTC) {
        this.operationInProgress = operationInProgress;
        this.operationInProgressLockTimeoutInUTC = operationInProgressLockTimeoutInUTC;
    }

    /**
     * Denotes whether move operation is in progress
     * 
    */
    public Optional<String> getOperationInProgress() {
        return Optional.ofNullable(this.operationInProgress);
    }
    /**
     * Denotes the timeout of the operation to finish
     * 
    */
    public Optional<String> getOperationInProgressLockTimeoutInUTC() {
        return Optional.ofNullable(this.operationInProgressLockTimeoutInUTC);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceMoveDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String operationInProgress;
        private @Nullable String operationInProgressLockTimeoutInUTC;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceMoveDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operationInProgress = defaults.operationInProgress;
    	      this.operationInProgressLockTimeoutInUTC = defaults.operationInProgressLockTimeoutInUTC;
        }

        public Builder setOperationInProgress(@Nullable String operationInProgress) {
            this.operationInProgress = operationInProgress;
            return this;
        }

        public Builder setOperationInProgressLockTimeoutInUTC(@Nullable String operationInProgressLockTimeoutInUTC) {
            this.operationInProgressLockTimeoutInUTC = operationInProgressLockTimeoutInUTC;
            return this;
        }
        public ResourceMoveDetailsResponse build() {
            return new ResourceMoveDetailsResponse(operationInProgress, operationInProgressLockTimeoutInUTC);
        }
    }
}