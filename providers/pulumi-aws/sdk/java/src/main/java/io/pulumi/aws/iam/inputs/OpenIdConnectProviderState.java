// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OpenIdConnectProviderState extends io.pulumi.resources.ResourceArgs {

    public static final OpenIdConnectProviderState Empty = new OpenIdConnectProviderState();

    /**
     * The ARN assigned by AWS for this provider.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> arn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * A list of client IDs (also known as audiences). When a mobile or web app registers with an OpenID Connect provider, they establish a value that identifies the application. (This is the value that's sent as the client_id parameter on OAuth requests.)
     * 
     */
    @Import(name="clientIdLists")
      private final @Nullable Output<List<String>> clientIdLists;

    public Output<List<String>> clientIdLists() {
        return this.clientIdLists == null ? Codegen.empty() : this.clientIdLists;
    }

    /**
     * Map of resource tags for the IAM OIDC provider. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    /**
     * A list of server certificate thumbprints for the OpenID Connect (OIDC) identity provider's server certificate(s).
     * 
     */
    @Import(name="thumbprintLists")
      private final @Nullable Output<List<String>> thumbprintLists;

    public Output<List<String>> thumbprintLists() {
        return this.thumbprintLists == null ? Codegen.empty() : this.thumbprintLists;
    }

    /**
     * The URL of the identity provider. Corresponds to the _iss_ claim.
     * 
     */
    @Import(name="url")
      private final @Nullable Output<String> url;

    public Output<String> url() {
        return this.url == null ? Codegen.empty() : this.url;
    }

    public OpenIdConnectProviderState(
        @Nullable Output<String> arn,
        @Nullable Output<List<String>> clientIdLists,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<List<String>> thumbprintLists,
        @Nullable Output<String> url) {
        this.arn = arn;
        this.clientIdLists = clientIdLists;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.thumbprintLists = thumbprintLists;
        this.url = url;
    }

    private OpenIdConnectProviderState() {
        this.arn = Codegen.empty();
        this.clientIdLists = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
        this.thumbprintLists = Codegen.empty();
        this.url = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OpenIdConnectProviderState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<List<String>> clientIdLists;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<List<String>> thumbprintLists;
        private @Nullable Output<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(OpenIdConnectProviderState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.clientIdLists = defaults.clientIdLists;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.thumbprintLists = defaults.thumbprintLists;
    	      this.url = defaults.url;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder clientIdLists(@Nullable Output<List<String>> clientIdLists) {
            this.clientIdLists = clientIdLists;
            return this;
        }
        public Builder clientIdLists(@Nullable List<String> clientIdLists) {
            this.clientIdLists = Codegen.ofNullable(clientIdLists);
            return this;
        }
        public Builder clientIdLists(String... clientIdLists) {
            return clientIdLists(List.of(clientIdLists));
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }
        public Builder thumbprintLists(@Nullable Output<List<String>> thumbprintLists) {
            this.thumbprintLists = thumbprintLists;
            return this;
        }
        public Builder thumbprintLists(@Nullable List<String> thumbprintLists) {
            this.thumbprintLists = Codegen.ofNullable(thumbprintLists);
            return this;
        }
        public Builder thumbprintLists(String... thumbprintLists) {
            return thumbprintLists(List.of(thumbprintLists));
        }
        public Builder url(@Nullable Output<String> url) {
            this.url = url;
            return this;
        }
        public Builder url(@Nullable String url) {
            this.url = Codegen.ofNullable(url);
            return this;
        }        public OpenIdConnectProviderState build() {
            return new OpenIdConnectProviderState(arn, clientIdLists, tags, tagsAll, thumbprintLists, url);
        }
    }
}
