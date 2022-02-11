// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.xray.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetGroupArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetGroupArgs Empty = new GetGroupArgs();

    @InputImport(name="groupARN", required=true)
    private final String groupARN;

    public String getGroupARN() {
        return this.groupARN;
    }

    public GetGroupArgs(String groupARN) {
        this.groupARN = Objects.requireNonNull(groupARN, "expected parameter 'groupARN' to be non-null");
    }

    private GetGroupArgs() {
        this.groupARN = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String groupARN;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupARN = defaults.groupARN;
        }

        public Builder setGroupARN(String groupARN) {
            this.groupARN = Objects.requireNonNull(groupARN);
            return this;
        }

        public GetGroupArgs build() {
            return new GetGroupArgs(groupARN);
        }
    }
}
