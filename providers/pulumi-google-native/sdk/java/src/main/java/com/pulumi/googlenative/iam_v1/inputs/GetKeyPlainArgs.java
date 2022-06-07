// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.iam_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetKeyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetKeyPlainArgs Empty = new GetKeyPlainArgs();

    @Import(name="keyId", required=true)
    private String keyId;

    public String keyId() {
        return this.keyId;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="publicKeyType")
    private @Nullable String publicKeyType;

    public Optional<String> publicKeyType() {
        return Optional.ofNullable(this.publicKeyType);
    }

    @Import(name="serviceAccountId", required=true)
    private String serviceAccountId;

    public String serviceAccountId() {
        return this.serviceAccountId;
    }

    private GetKeyPlainArgs() {}

    private GetKeyPlainArgs(GetKeyPlainArgs $) {
        this.keyId = $.keyId;
        this.project = $.project;
        this.publicKeyType = $.publicKeyType;
        this.serviceAccountId = $.serviceAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetKeyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetKeyPlainArgs $;

        public Builder() {
            $ = new GetKeyPlainArgs();
        }

        public Builder(GetKeyPlainArgs defaults) {
            $ = new GetKeyPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder keyId(String keyId) {
            $.keyId = keyId;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder publicKeyType(@Nullable String publicKeyType) {
            $.publicKeyType = publicKeyType;
            return this;
        }

        public Builder serviceAccountId(String serviceAccountId) {
            $.serviceAccountId = serviceAccountId;
            return this;
        }

        public GetKeyPlainArgs build() {
            $.keyId = Objects.requireNonNull($.keyId, "expected parameter 'keyId' to be non-null");
            $.serviceAccountId = Objects.requireNonNull($.serviceAccountId, "expected parameter 'serviceAccountId' to be non-null");
            return $;
        }
    }

}
