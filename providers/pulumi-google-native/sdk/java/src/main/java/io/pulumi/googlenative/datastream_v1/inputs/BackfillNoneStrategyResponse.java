// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1.inputs;

import java.util.Objects;


/**
 * Backfill strategy to disable automatic backfill for the Stream's objects.
 * 
 */
public final class BackfillNoneStrategyResponse extends io.pulumi.resources.InvokeArgs {

    public static final BackfillNoneStrategyResponse Empty = new BackfillNoneStrategyResponse();

    public BackfillNoneStrategyResponse() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackfillNoneStrategyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(BackfillNoneStrategyResponse defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public BackfillNoneStrategyResponse build() {
            return new BackfillNoneStrategyResponse();
        }
    }
}