// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.datastream_v1alpha1.inputs.OracleRdbmsArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Oracle data source configuration
 * 
 */
public final class OracleSourceConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final OracleSourceConfigArgs Empty = new OracleSourceConfigArgs();

    /**
     * Oracle objects to include in the stream.
     * 
     */
    @InputImport(name="allowlist")
      private final @Nullable Input<OracleRdbmsArgs> allowlist;

    public Input<OracleRdbmsArgs> getAllowlist() {
        return this.allowlist == null ? Input.empty() : this.allowlist;
    }

    /**
     * Oracle objects to exclude from the stream.
     * 
     */
    @InputImport(name="rejectlist")
      private final @Nullable Input<OracleRdbmsArgs> rejectlist;

    public Input<OracleRdbmsArgs> getRejectlist() {
        return this.rejectlist == null ? Input.empty() : this.rejectlist;
    }

    public OracleSourceConfigArgs(
        @Nullable Input<OracleRdbmsArgs> allowlist,
        @Nullable Input<OracleRdbmsArgs> rejectlist) {
        this.allowlist = allowlist;
        this.rejectlist = rejectlist;
    }

    private OracleSourceConfigArgs() {
        this.allowlist = Input.empty();
        this.rejectlist = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OracleSourceConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<OracleRdbmsArgs> allowlist;
        private @Nullable Input<OracleRdbmsArgs> rejectlist;

        public Builder() {
    	      // Empty
        }

        public Builder(OracleSourceConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowlist = defaults.allowlist;
    	      this.rejectlist = defaults.rejectlist;
        }

        public Builder setAllowlist(@Nullable Input<OracleRdbmsArgs> allowlist) {
            this.allowlist = allowlist;
            return this;
        }

        public Builder setAllowlist(@Nullable OracleRdbmsArgs allowlist) {
            this.allowlist = Input.ofNullable(allowlist);
            return this;
        }

        public Builder setRejectlist(@Nullable Input<OracleRdbmsArgs> rejectlist) {
            this.rejectlist = rejectlist;
            return this;
        }

        public Builder setRejectlist(@Nullable OracleRdbmsArgs rejectlist) {
            this.rejectlist = Input.ofNullable(rejectlist);
            return this;
        }
        public OracleSourceConfigArgs build() {
            return new OracleSourceConfigArgs(allowlist, rejectlist);
        }
    }
}