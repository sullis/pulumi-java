// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudresourcemanager_v2beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFolderIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFolderIamPolicyArgs Empty = new GetFolderIamPolicyArgs();

    @Import(name="folderId", required=true)
    private Output<String> folderId;

    public Output<String> folderId() {
        return this.folderId;
    }

    private GetFolderIamPolicyArgs() {}

    private GetFolderIamPolicyArgs(GetFolderIamPolicyArgs $) {
        this.folderId = $.folderId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFolderIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFolderIamPolicyArgs $;

        public Builder() {
            $ = new GetFolderIamPolicyArgs();
        }

        public Builder(GetFolderIamPolicyArgs defaults) {
            $ = new GetFolderIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder folderId(Output<String> folderId) {
            $.folderId = folderId;
            return this;
        }

        public Builder folderId(String folderId) {
            return folderId(Output.of(folderId));
        }

        public GetFolderIamPolicyArgs build() {
            $.folderId = Objects.requireNonNull($.folderId, "expected parameter 'folderId' to be non-null");
            return $;
        }
    }

}
