// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafregional;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class WebAclAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclAssociationArgs Empty = new WebAclAssociationArgs();

    /**
     * ARN of the resource to associate with. For example, an Application Load Balancer or API Gateway Stage.
     * 
     */
    @Import(name="resourceArn", required=true)
      private final Output<String> resourceArn;

    public Output<String> resourceArn() {
        return this.resourceArn;
    }

    /**
     * The ID of the WAF Regional WebACL to create an association.
     * 
     */
    @Import(name="webAclId", required=true)
      private final Output<String> webAclId;

    public Output<String> webAclId() {
        return this.webAclId;
    }

    public WebAclAssociationArgs(
        Output<String> resourceArn,
        Output<String> webAclId) {
        this.resourceArn = Objects.requireNonNull(resourceArn, "expected parameter 'resourceArn' to be non-null");
        this.webAclId = Objects.requireNonNull(webAclId, "expected parameter 'webAclId' to be non-null");
    }

    private WebAclAssociationArgs() {
        this.resourceArn = Codegen.empty();
        this.webAclId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> resourceArn;
        private Output<String> webAclId;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceArn = defaults.resourceArn;
    	      this.webAclId = defaults.webAclId;
        }

        public Builder resourceArn(Output<String> resourceArn) {
            this.resourceArn = Objects.requireNonNull(resourceArn);
            return this;
        }
        public Builder resourceArn(String resourceArn) {
            this.resourceArn = Output.of(Objects.requireNonNull(resourceArn));
            return this;
        }
        public Builder webAclId(Output<String> webAclId) {
            this.webAclId = Objects.requireNonNull(webAclId);
            return this;
        }
        public Builder webAclId(String webAclId) {
            this.webAclId = Output.of(Objects.requireNonNull(webAclId));
            return this;
        }        public WebAclAssociationArgs build() {
            return new WebAclAssociationArgs(resourceArn, webAclId);
        }
    }
}
