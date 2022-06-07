// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetKeyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetKeyPlainArgs Empty = new GetKeyPlainArgs();

    @Import(name="appId", required=true)
    private String appId;

    public String appId() {
        return this.appId;
    }

    @Import(name="developerId", required=true)
    private String developerId;

    public String developerId() {
        return this.developerId;
    }

    @Import(name="keyId", required=true)
    private String keyId;

    public String keyId() {
        return this.keyId;
    }

    @Import(name="organizationId", required=true)
    private String organizationId;

    public String organizationId() {
        return this.organizationId;
    }

    private GetKeyPlainArgs() {}

    private GetKeyPlainArgs(GetKeyPlainArgs $) {
        this.appId = $.appId;
        this.developerId = $.developerId;
        this.keyId = $.keyId;
        this.organizationId = $.organizationId;
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

        public Builder appId(String appId) {
            $.appId = appId;
            return this;
        }

        public Builder developerId(String developerId) {
            $.developerId = developerId;
            return this;
        }

        public Builder keyId(String keyId) {
            $.keyId = keyId;
            return this;
        }

        public Builder organizationId(String organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        public GetKeyPlainArgs build() {
            $.appId = Objects.requireNonNull($.appId, "expected parameter 'appId' to be non-null");
            $.developerId = Objects.requireNonNull($.developerId, "expected parameter 'developerId' to be non-null");
            $.keyId = Objects.requireNonNull($.keyId, "expected parameter 'keyId' to be non-null");
            $.organizationId = Objects.requireNonNull($.organizationId, "expected parameter 'organizationId' to be non-null");
            return $;
        }
    }

}
