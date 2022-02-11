// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.redshift.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ScheduledActionPauseClusterMessage extends io.pulumi.resources.InvokeArgs {

    public static final ScheduledActionPauseClusterMessage Empty = new ScheduledActionPauseClusterMessage();

    @InputImport(name="clusterIdentifier", required=true)
    private final String clusterIdentifier;

    public String getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    public ScheduledActionPauseClusterMessage(String clusterIdentifier) {
        this.clusterIdentifier = Objects.requireNonNull(clusterIdentifier, "expected parameter 'clusterIdentifier' to be non-null");
    }

    private ScheduledActionPauseClusterMessage() {
        this.clusterIdentifier = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduledActionPauseClusterMessage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clusterIdentifier;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduledActionPauseClusterMessage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterIdentifier = defaults.clusterIdentifier;
        }

        public Builder setClusterIdentifier(String clusterIdentifier) {
            this.clusterIdentifier = Objects.requireNonNull(clusterIdentifier);
            return this;
        }

        public ScheduledActionPauseClusterMessage build() {
            return new ScheduledActionPauseClusterMessage(clusterIdentifier);
        }
    }
}
