// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TransferJobTransferSpecObjectConditionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final TransferJobTransferSpecObjectConditionsArgs Empty = new TransferJobTransferSpecObjectConditionsArgs();

    /**
     * `exclude_prefixes` must follow the requirements described for `include_prefixes`. See [Requirements](https://cloud.google.com/storage-transfer/docs/reference/rest/v1/TransferSpec#ObjectConditions).
     * 
     */
    @InputImport(name="excludePrefixes")
    private final @Nullable Input<List<String>> excludePrefixes;

    public Input<List<String>> getExcludePrefixes() {
        return this.excludePrefixes == null ? Input.empty() : this.excludePrefixes;
    }

    /**
     * If `include_prefixes` is specified, objects that satisfy the object conditions must have names that start with one of the `include_prefixes` and that do not start with any of the `exclude_prefixes`. If `include_prefixes` is not specified, all objects except those that have names starting with one of the `exclude_prefixes` must satisfy the object conditions. See [Requirements](https://cloud.google.com/storage-transfer/docs/reference/rest/v1/TransferSpec#ObjectConditions).
     * 
     */
    @InputImport(name="includePrefixes")
    private final @Nullable Input<List<String>> includePrefixes;

    public Input<List<String>> getIncludePrefixes() {
        return this.includePrefixes == null ? Input.empty() : this.includePrefixes;
    }

    /**
     * A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
     * 
     */
    @InputImport(name="maxTimeElapsedSinceLastModification")
    private final @Nullable Input<String> maxTimeElapsedSinceLastModification;

    public Input<String> getMaxTimeElapsedSinceLastModification() {
        return this.maxTimeElapsedSinceLastModification == null ? Input.empty() : this.maxTimeElapsedSinceLastModification;
    }

    /**
     * A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
     * 
     */
    @InputImport(name="minTimeElapsedSinceLastModification")
    private final @Nullable Input<String> minTimeElapsedSinceLastModification;

    public Input<String> getMinTimeElapsedSinceLastModification() {
        return this.minTimeElapsedSinceLastModification == null ? Input.empty() : this.minTimeElapsedSinceLastModification;
    }

    public TransferJobTransferSpecObjectConditionsArgs(
        @Nullable Input<List<String>> excludePrefixes,
        @Nullable Input<List<String>> includePrefixes,
        @Nullable Input<String> maxTimeElapsedSinceLastModification,
        @Nullable Input<String> minTimeElapsedSinceLastModification) {
        this.excludePrefixes = excludePrefixes;
        this.includePrefixes = includePrefixes;
        this.maxTimeElapsedSinceLastModification = maxTimeElapsedSinceLastModification;
        this.minTimeElapsedSinceLastModification = minTimeElapsedSinceLastModification;
    }

    private TransferJobTransferSpecObjectConditionsArgs() {
        this.excludePrefixes = Input.empty();
        this.includePrefixes = Input.empty();
        this.maxTimeElapsedSinceLastModification = Input.empty();
        this.minTimeElapsedSinceLastModification = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransferJobTransferSpecObjectConditionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> excludePrefixes;
        private @Nullable Input<List<String>> includePrefixes;
        private @Nullable Input<String> maxTimeElapsedSinceLastModification;
        private @Nullable Input<String> minTimeElapsedSinceLastModification;

        public Builder() {
    	      // Empty
        }

        public Builder(TransferJobTransferSpecObjectConditionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludePrefixes = defaults.excludePrefixes;
    	      this.includePrefixes = defaults.includePrefixes;
    	      this.maxTimeElapsedSinceLastModification = defaults.maxTimeElapsedSinceLastModification;
    	      this.minTimeElapsedSinceLastModification = defaults.minTimeElapsedSinceLastModification;
        }

        public Builder setExcludePrefixes(@Nullable Input<List<String>> excludePrefixes) {
            this.excludePrefixes = excludePrefixes;
            return this;
        }

        public Builder setExcludePrefixes(@Nullable List<String> excludePrefixes) {
            this.excludePrefixes = Input.ofNullable(excludePrefixes);
            return this;
        }

        public Builder setIncludePrefixes(@Nullable Input<List<String>> includePrefixes) {
            this.includePrefixes = includePrefixes;
            return this;
        }

        public Builder setIncludePrefixes(@Nullable List<String> includePrefixes) {
            this.includePrefixes = Input.ofNullable(includePrefixes);
            return this;
        }

        public Builder setMaxTimeElapsedSinceLastModification(@Nullable Input<String> maxTimeElapsedSinceLastModification) {
            this.maxTimeElapsedSinceLastModification = maxTimeElapsedSinceLastModification;
            return this;
        }

        public Builder setMaxTimeElapsedSinceLastModification(@Nullable String maxTimeElapsedSinceLastModification) {
            this.maxTimeElapsedSinceLastModification = Input.ofNullable(maxTimeElapsedSinceLastModification);
            return this;
        }

        public Builder setMinTimeElapsedSinceLastModification(@Nullable Input<String> minTimeElapsedSinceLastModification) {
            this.minTimeElapsedSinceLastModification = minTimeElapsedSinceLastModification;
            return this;
        }

        public Builder setMinTimeElapsedSinceLastModification(@Nullable String minTimeElapsedSinceLastModification) {
            this.minTimeElapsedSinceLastModification = Input.ofNullable(minTimeElapsedSinceLastModification);
            return this;
        }

        public TransferJobTransferSpecObjectConditionsArgs build() {
            return new TransferJobTransferSpecObjectConditionsArgs(excludePrefixes, includePrefixes, maxTimeElapsedSinceLastModification, minTimeElapsedSinceLastModification);
        }
    }
}
