// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGroupUser {
    /**
     * The Amazon Resource Name (ARN) specifying the iam user.
     * 
     */
    private final String arn;
    /**
     * The path to the iam user.
     * 
     */
    private final String path;
    /**
     * The stable and unique string identifying the iam user.
     * 
     */
    private final String userId;
    /**
     * The name of the iam user.
     * 
     */
    private final String userName;

    @CustomType.Constructor
    private GetGroupUser(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("path") String path,
        @CustomType.Parameter("userId") String userId,
        @CustomType.Parameter("userName") String userName) {
        this.arn = arn;
        this.path = path;
        this.userId = userId;
        this.userName = userName;
    }

    /**
     * The Amazon Resource Name (ARN) specifying the iam user.
     * 
    */
    public String arn() {
        return this.arn;
    }
    /**
     * The path to the iam user.
     * 
    */
    public String path() {
        return this.path;
    }
    /**
     * The stable and unique string identifying the iam user.
     * 
    */
    public String userId() {
        return this.userId;
    }
    /**
     * The name of the iam user.
     * 
    */
    public String userName() {
        return this.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGroupUser defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String path;
        private String userId;
        private String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGroupUser defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.path = defaults.path;
    	      this.userId = defaults.userId;
    	      this.userName = defaults.userName;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public Builder userId(String userId) {
            this.userId = Objects.requireNonNull(userId);
            return this;
        }
        public Builder userName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }        public GetGroupUser build() {
            return new GetGroupUser(arn, path, userId, userName);
        }
    }
}
