// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apps_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * DEPRECATED.
 * 
 */
public final class RollbackConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final RollbackConfigArgs Empty = new RollbackConfigArgs();

    /**
     * The revision to rollback to. If set to 0, rollback to the last revision.
     * 
     */
    @Import(name="revision")
      private final @Nullable Output<Integer> revision;

    public Output<Integer> getRevision() {
        return this.revision == null ? Output.empty() : this.revision;
    }

    public RollbackConfigArgs(@Nullable Output<Integer> revision) {
        this.revision = revision;
    }

    private RollbackConfigArgs() {
        this.revision = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RollbackConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> revision;

        public Builder() {
    	      // Empty
        }

        public Builder(RollbackConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.revision = defaults.revision;
        }

        public Builder revision(@Nullable Output<Integer> revision) {
            this.revision = revision;
            return this;
        }
        public Builder revision(@Nullable Integer revision) {
            this.revision = Output.ofNullable(revision);
            return this;
        }        public RollbackConfigArgs build() {
            return new RollbackConfigArgs(revision);
        }
    }
}
