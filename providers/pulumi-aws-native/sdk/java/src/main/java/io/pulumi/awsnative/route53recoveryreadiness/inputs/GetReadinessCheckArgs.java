// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53recoveryreadiness.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetReadinessCheckArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetReadinessCheckArgs Empty = new GetReadinessCheckArgs();

    /**
     * Name of the ReadinessCheck to create.
     * 
     */
    @InputImport(name="readinessCheckName", required=true)
      private final String readinessCheckName;

    public String getReadinessCheckName() {
        return this.readinessCheckName;
    }

    public GetReadinessCheckArgs(String readinessCheckName) {
        this.readinessCheckName = Objects.requireNonNull(readinessCheckName, "expected parameter 'readinessCheckName' to be non-null");
    }

    private GetReadinessCheckArgs() {
        this.readinessCheckName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetReadinessCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String readinessCheckName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetReadinessCheckArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.readinessCheckName = defaults.readinessCheckName;
        }

        public Builder setReadinessCheckName(String readinessCheckName) {
            this.readinessCheckName = Objects.requireNonNull(readinessCheckName);
            return this;
        }
        public GetReadinessCheckArgs build() {
            return new GetReadinessCheckArgs(readinessCheckName);
        }
    }
}