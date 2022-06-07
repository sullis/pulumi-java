// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicemanagement_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetConfigPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConfigPlainArgs Empty = new GetConfigPlainArgs();

    @Import(name="configId", required=true)
    private String configId;

    public String configId() {
        return this.configId;
    }

    @Import(name="serviceName", required=true)
    private String serviceName;

    public String serviceName() {
        return this.serviceName;
    }

    @Import(name="view")
    private @Nullable String view;

    public Optional<String> view() {
        return Optional.ofNullable(this.view);
    }

    private GetConfigPlainArgs() {}

    private GetConfigPlainArgs(GetConfigPlainArgs $) {
        this.configId = $.configId;
        this.serviceName = $.serviceName;
        this.view = $.view;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConfigPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConfigPlainArgs $;

        public Builder() {
            $ = new GetConfigPlainArgs();
        }

        public Builder(GetConfigPlainArgs defaults) {
            $ = new GetConfigPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder configId(String configId) {
            $.configId = configId;
            return this;
        }

        public Builder serviceName(String serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        public Builder view(@Nullable String view) {
            $.view = view;
            return this;
        }

        public GetConfigPlainArgs build() {
            $.configId = Objects.requireNonNull($.configId, "expected parameter 'configId' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
