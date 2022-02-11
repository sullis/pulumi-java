// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.codeguruprofiler.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetProfilingGroupArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetProfilingGroupArgs Empty = new GetProfilingGroupArgs();

    @InputImport(name="profilingGroupName", required=true)
    private final String profilingGroupName;

    public String getProfilingGroupName() {
        return this.profilingGroupName;
    }

    public GetProfilingGroupArgs(String profilingGroupName) {
        this.profilingGroupName = Objects.requireNonNull(profilingGroupName, "expected parameter 'profilingGroupName' to be non-null");
    }

    private GetProfilingGroupArgs() {
        this.profilingGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProfilingGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String profilingGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProfilingGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.profilingGroupName = defaults.profilingGroupName;
        }

        public Builder setProfilingGroupName(String profilingGroupName) {
            this.profilingGroupName = Objects.requireNonNull(profilingGroupName);
            return this;
        }

        public GetProfilingGroupArgs build() {
            return new GetProfilingGroupArgs(profilingGroupName);
        }
    }
}
