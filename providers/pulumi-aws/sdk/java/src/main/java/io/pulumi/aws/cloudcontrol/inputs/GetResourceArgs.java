// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudcontrol.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetResourceArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetResourceArgs Empty = new GetResourceArgs();

    /**
     * Identifier of the CloudFormation resource type. For example, `vpc-12345678`.
     * 
     */
    @Import(name="identifier", required=true)
      private final String identifier;

    public String identifier() {
        return this.identifier;
    }

    /**
     * Amazon Resource Name (ARN) of the IAM Role to assume for operations.
     * 
     */
    @Import(name="roleArn")
      private final @Nullable String roleArn;

    public Optional<String> roleArn() {
        return this.roleArn == null ? Optional.empty() : Optional.ofNullable(this.roleArn);
    }

    /**
     * CloudFormation resource type name. For example, `AWS::EC2::VPC`.
     * 
     */
    @Import(name="typeName", required=true)
      private final String typeName;

    public String typeName() {
        return this.typeName;
    }

    /**
     * Identifier of the CloudFormation resource type version.
     * 
     */
    @Import(name="typeVersionId")
      private final @Nullable String typeVersionId;

    public Optional<String> typeVersionId() {
        return this.typeVersionId == null ? Optional.empty() : Optional.ofNullable(this.typeVersionId);
    }

    public GetResourceArgs(
        String identifier,
        @Nullable String roleArn,
        String typeName,
        @Nullable String typeVersionId) {
        this.identifier = Objects.requireNonNull(identifier, "expected parameter 'identifier' to be non-null");
        this.roleArn = roleArn;
        this.typeName = Objects.requireNonNull(typeName, "expected parameter 'typeName' to be non-null");
        this.typeVersionId = typeVersionId;
    }

    private GetResourceArgs() {
        this.identifier = null;
        this.roleArn = null;
        this.typeName = null;
        this.typeVersionId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String identifier;
        private @Nullable String roleArn;
        private String typeName;
        private @Nullable String typeVersionId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identifier = defaults.identifier;
    	      this.roleArn = defaults.roleArn;
    	      this.typeName = defaults.typeName;
    	      this.typeVersionId = defaults.typeVersionId;
        }

        public Builder identifier(String identifier) {
            this.identifier = Objects.requireNonNull(identifier);
            return this;
        }
        public Builder roleArn(@Nullable String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public Builder typeName(String typeName) {
            this.typeName = Objects.requireNonNull(typeName);
            return this;
        }
        public Builder typeVersionId(@Nullable String typeVersionId) {
            this.typeVersionId = typeVersionId;
            return this;
        }        public GetResourceArgs build() {
            return new GetResourceArgs(identifier, roleArn, typeName, typeVersionId);
        }
    }
}
