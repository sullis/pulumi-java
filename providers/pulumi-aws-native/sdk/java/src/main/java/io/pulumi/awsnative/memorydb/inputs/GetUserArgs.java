// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.memorydb.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetUserArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetUserArgs Empty = new GetUserArgs();

    /**
     * The name of the user.
     * 
     */
    @Import(name="userName", required=true)
      private final String userName;

    public String userName() {
        return this.userName;
    }

    public GetUserArgs(String userName) {
        this.userName = Objects.requireNonNull(userName, "expected parameter 'userName' to be non-null");
    }

    private GetUserArgs() {
        this.userName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUserArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.userName = defaults.userName;
        }

        public Builder userName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }        public GetUserArgs build() {
            return new GetUserArgs(userName);
        }
    }
}
