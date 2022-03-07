// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.enums.WsdlImportMethod;
import io.pulumi.azurenative.web.inputs.WsdlService;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListCustomApiWsdlInterfacesArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListCustomApiWsdlInterfacesArgs Empty = new ListCustomApiWsdlInterfacesArgs();

    /**
     * The WSDL content
     * 
     */
    @InputImport(name="content")
      private final @Nullable String content;

    public Optional<String> getContent() {
        return this.content == null ? Optional.empty() : Optional.ofNullable(this.content);
    }

    /**
     * The WSDL import method
     * 
     */
    @InputImport(name="importMethod")
      private final @Nullable Either<String,WsdlImportMethod> importMethod;

    public Either<String,WsdlImportMethod> getImportMethod() {
        return this.importMethod == null ? null : this.importMethod;
    }

    /**
     * The location
     * 
     */
    @InputImport(name="location", required=true)
      private final String location;

    public String getLocation() {
        return this.location;
    }

    /**
     * The service with name and endpoint names
     * 
     */
    @InputImport(name="service")
      private final @Nullable WsdlService service;

    public Optional<WsdlService> getService() {
        return this.service == null ? Optional.empty() : Optional.ofNullable(this.service);
    }

    /**
     * Subscription Id
     * 
     */
    @InputImport(name="subscriptionId")
      private final @Nullable String subscriptionId;

    public Optional<String> getSubscriptionId() {
        return this.subscriptionId == null ? Optional.empty() : Optional.ofNullable(this.subscriptionId);
    }

    /**
     * The WSDL URL
     * 
     */
    @InputImport(name="url")
      private final @Nullable String url;

    public Optional<String> getUrl() {
        return this.url == null ? Optional.empty() : Optional.ofNullable(this.url);
    }

    public ListCustomApiWsdlInterfacesArgs(
        @Nullable String content,
        @Nullable Either<String,WsdlImportMethod> importMethod,
        String location,
        @Nullable WsdlService service,
        @Nullable String subscriptionId,
        @Nullable String url) {
        this.content = content;
        this.importMethod = importMethod;
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.service = service;
        this.subscriptionId = subscriptionId;
        this.url = url;
    }

    private ListCustomApiWsdlInterfacesArgs() {
        this.content = null;
        this.importMethod = null;
        this.location = null;
        this.service = null;
        this.subscriptionId = null;
        this.url = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListCustomApiWsdlInterfacesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String content;
        private @Nullable Either<String,WsdlImportMethod> importMethod;
        private String location;
        private @Nullable WsdlService service;
        private @Nullable String subscriptionId;
        private @Nullable String url;

        public Builder() {
    	      // Empty
        }

        public Builder(ListCustomApiWsdlInterfacesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.importMethod = defaults.importMethod;
    	      this.location = defaults.location;
    	      this.service = defaults.service;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.url = defaults.url;
        }

        public Builder setContent(@Nullable String content) {
            this.content = content;
            return this;
        }

        public Builder setImportMethod(@Nullable Either<String,WsdlImportMethod> importMethod) {
            this.importMethod = importMethod;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setService(@Nullable WsdlService service) {
            this.service = service;
            return this;
        }

        public Builder setSubscriptionId(@Nullable String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        public Builder setUrl(@Nullable String url) {
            this.url = url;
            return this;
        }
        public ListCustomApiWsdlInterfacesArgs build() {
            return new ListCustomApiWsdlInterfacesArgs(content, importMethod, location, service, subscriptionId, url);
        }
    }
}