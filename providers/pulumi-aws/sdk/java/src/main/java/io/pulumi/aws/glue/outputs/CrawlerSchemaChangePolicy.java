// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CrawlerSchemaChangePolicy {
    /**
     * The deletion behavior when the crawler finds a deleted object. Valid values: `LOG`, `DELETE_FROM_DATABASE`, or `DEPRECATE_IN_DATABASE`. Defaults to `DEPRECATE_IN_DATABASE`.
     * 
     */
    private final @Nullable String deleteBehavior;
    /**
     * The update behavior when the crawler finds a changed schema. Valid values: `LOG` or `UPDATE_IN_DATABASE`. Defaults to `UPDATE_IN_DATABASE`.
     * 
     */
    private final @Nullable String updateBehavior;

    @CustomType.Constructor
    private CrawlerSchemaChangePolicy(
        @CustomType.Parameter("deleteBehavior") @Nullable String deleteBehavior,
        @CustomType.Parameter("updateBehavior") @Nullable String updateBehavior) {
        this.deleteBehavior = deleteBehavior;
        this.updateBehavior = updateBehavior;
    }

    /**
     * The deletion behavior when the crawler finds a deleted object. Valid values: `LOG`, `DELETE_FROM_DATABASE`, or `DEPRECATE_IN_DATABASE`. Defaults to `DEPRECATE_IN_DATABASE`.
     * 
    */
    public Optional<String> deleteBehavior() {
        return Optional.ofNullable(this.deleteBehavior);
    }
    /**
     * The update behavior when the crawler finds a changed schema. Valid values: `LOG` or `UPDATE_IN_DATABASE`. Defaults to `UPDATE_IN_DATABASE`.
     * 
    */
    public Optional<String> updateBehavior() {
        return Optional.ofNullable(this.updateBehavior);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CrawlerSchemaChangePolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String deleteBehavior;
        private @Nullable String updateBehavior;

        public Builder() {
    	      // Empty
        }

        public Builder(CrawlerSchemaChangePolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteBehavior = defaults.deleteBehavior;
    	      this.updateBehavior = defaults.updateBehavior;
        }

        public Builder deleteBehavior(@Nullable String deleteBehavior) {
            this.deleteBehavior = deleteBehavior;
            return this;
        }
        public Builder updateBehavior(@Nullable String updateBehavior) {
            this.updateBehavior = updateBehavior;
            return this;
        }        public CrawlerSchemaChangePolicy build() {
            return new CrawlerSchemaChangePolicy(deleteBehavior, updateBehavior);
        }
    }
}
