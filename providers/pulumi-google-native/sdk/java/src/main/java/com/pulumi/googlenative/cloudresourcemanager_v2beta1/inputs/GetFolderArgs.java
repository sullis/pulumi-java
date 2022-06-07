// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudresourcemanager_v2beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFolderArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFolderArgs Empty = new GetFolderArgs();

    @Import(name="folderId", required=true)
    private Output<String> folderId;

    public Output<String> folderId() {
        return this.folderId;
    }

    private GetFolderArgs() {}

    private GetFolderArgs(GetFolderArgs $) {
        this.folderId = $.folderId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFolderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFolderArgs $;

        public Builder() {
            $ = new GetFolderArgs();
        }

        public Builder(GetFolderArgs defaults) {
            $ = new GetFolderArgs(Objects.requireNonNull(defaults));
        }

        public Builder folderId(Output<String> folderId) {
            $.folderId = folderId;
            return this;
        }

        public Builder folderId(String folderId) {
            return folderId(Output.of(folderId));
        }

        public GetFolderArgs build() {
            $.folderId = Objects.requireNonNull($.folderId, "expected parameter 'folderId' to be non-null");
            return $;
        }
    }

}
