// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetRealtimeLogConfigArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRealtimeLogConfigArgs Empty = new GetRealtimeLogConfigArgs();

    @Import(name="arn", required=true)
      private final String arn;

    public String arn() {
        return this.arn;
    }

    public GetRealtimeLogConfigArgs(String arn) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
    }

    private GetRealtimeLogConfigArgs() {
        this.arn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRealtimeLogConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRealtimeLogConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }        public GetRealtimeLogConfigArgs build() {
            return new GetRealtimeLogConfigArgs(arn);
        }
    }
}
