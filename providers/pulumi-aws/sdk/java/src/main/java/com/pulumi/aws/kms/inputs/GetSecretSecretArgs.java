// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kms.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSecretSecretArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetSecretSecretArgs Empty = new GetSecretSecretArgs();

    @Import(name="context")
    private @Nullable Output<Map<String,String>> context;

    public Optional<Output<Map<String,String>>> context() {
        return Optional.ofNullable(this.context);
    }

    @Import(name="grantTokens")
    private @Nullable Output<List<String>> grantTokens;

    public Optional<Output<List<String>>> grantTokens() {
        return Optional.ofNullable(this.grantTokens);
    }

    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    @Import(name="payload", required=true)
    private Output<String> payload;

    public Output<String> payload() {
        return this.payload;
    }

    private GetSecretSecretArgs() {}

    private GetSecretSecretArgs(GetSecretSecretArgs $) {
        this.context = $.context;
        this.grantTokens = $.grantTokens;
        this.name = $.name;
        this.payload = $.payload;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSecretSecretArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSecretSecretArgs $;

        public Builder() {
            $ = new GetSecretSecretArgs();
        }

        public Builder(GetSecretSecretArgs defaults) {
            $ = new GetSecretSecretArgs(Objects.requireNonNull(defaults));
        }

        public Builder context(@Nullable Output<Map<String,String>> context) {
            $.context = context;
            return this;
        }

        public Builder context(Map<String,String> context) {
            return context(Output.of(context));
        }

        public Builder grantTokens(@Nullable Output<List<String>> grantTokens) {
            $.grantTokens = grantTokens;
            return this;
        }

        public Builder grantTokens(List<String> grantTokens) {
            return grantTokens(Output.of(grantTokens));
        }

        public Builder grantTokens(String... grantTokens) {
            return grantTokens(List.of(grantTokens));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder payload(Output<String> payload) {
            $.payload = payload;
            return this;
        }

        public Builder payload(String payload) {
            return payload(Output.of(payload));
        }

        public GetSecretSecretArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.payload = Objects.requireNonNull($.payload, "expected parameter 'payload' to be non-null");
            return $;
        }
    }

}
