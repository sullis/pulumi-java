// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetWebAppFunctionResult {
    /**
     * @return Config information.
     * 
     */
    private final @Nullable Object config;
    /**
     * @return Config URI.
     * 
     */
    private final @Nullable String configHref;
    /**
     * @return File list.
     * 
     */
    private final @Nullable Map<String,String> files;
    /**
     * @return Function App ID.
     * 
     */
    private final @Nullable String functionAppId;
    /**
     * @return Function URI.
     * 
     */
    private final @Nullable String href;
    /**
     * @return Resource Id.
     * 
     */
    private final String id;
    /**
     * @return The invocation URL
     * 
     */
    private final @Nullable String invokeUrlTemplate;
    /**
     * @return Gets or sets a value indicating whether the function is disabled
     * 
     */
    private final @Nullable Boolean isDisabled;
    /**
     * @return Kind of resource.
     * 
     */
    private final @Nullable String kind;
    /**
     * @return The function language
     * 
     */
    private final @Nullable String language;
    /**
     * @return Resource Name.
     * 
     */
    private final String name;
    /**
     * @return Script URI.
     * 
     */
    private final @Nullable String scriptHref;
    /**
     * @return Script root path URI.
     * 
     */
    private final @Nullable String scriptRootPathHref;
    /**
     * @return Secrets file URI.
     * 
     */
    private final @Nullable String secretsFileHref;
    /**
     * @return Test data used when testing via the Azure Portal.
     * 
     */
    private final @Nullable String testData;
    /**
     * @return Test data URI.
     * 
     */
    private final @Nullable String testDataHref;
    /**
     * @return Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetWebAppFunctionResult(
        @CustomType.Parameter("config") @Nullable Object config,
        @CustomType.Parameter("configHref") @Nullable String configHref,
        @CustomType.Parameter("files") @Nullable Map<String,String> files,
        @CustomType.Parameter("functionAppId") @Nullable String functionAppId,
        @CustomType.Parameter("href") @Nullable String href,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("invokeUrlTemplate") @Nullable String invokeUrlTemplate,
        @CustomType.Parameter("isDisabled") @Nullable Boolean isDisabled,
        @CustomType.Parameter("kind") @Nullable String kind,
        @CustomType.Parameter("language") @Nullable String language,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("scriptHref") @Nullable String scriptHref,
        @CustomType.Parameter("scriptRootPathHref") @Nullable String scriptRootPathHref,
        @CustomType.Parameter("secretsFileHref") @Nullable String secretsFileHref,
        @CustomType.Parameter("testData") @Nullable String testData,
        @CustomType.Parameter("testDataHref") @Nullable String testDataHref,
        @CustomType.Parameter("type") String type) {
        this.config = config;
        this.configHref = configHref;
        this.files = files;
        this.functionAppId = functionAppId;
        this.href = href;
        this.id = id;
        this.invokeUrlTemplate = invokeUrlTemplate;
        this.isDisabled = isDisabled;
        this.kind = kind;
        this.language = language;
        this.name = name;
        this.scriptHref = scriptHref;
        this.scriptRootPathHref = scriptRootPathHref;
        this.secretsFileHref = secretsFileHref;
        this.testData = testData;
        this.testDataHref = testDataHref;
        this.type = type;
    }

    /**
     * @return Config information.
     * 
     */
    public Optional<Object> config() {
        return Optional.ofNullable(this.config);
    }
    /**
     * @return Config URI.
     * 
     */
    public Optional<String> configHref() {
        return Optional.ofNullable(this.configHref);
    }
    /**
     * @return File list.
     * 
     */
    public Map<String,String> files() {
        return this.files == null ? Map.of() : this.files;
    }
    /**
     * @return Function App ID.
     * 
     */
    public Optional<String> functionAppId() {
        return Optional.ofNullable(this.functionAppId);
    }
    /**
     * @return Function URI.
     * 
     */
    public Optional<String> href() {
        return Optional.ofNullable(this.href);
    }
    /**
     * @return Resource Id.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The invocation URL
     * 
     */
    public Optional<String> invokeUrlTemplate() {
        return Optional.ofNullable(this.invokeUrlTemplate);
    }
    /**
     * @return Gets or sets a value indicating whether the function is disabled
     * 
     */
    public Optional<Boolean> isDisabled() {
        return Optional.ofNullable(this.isDisabled);
    }
    /**
     * @return Kind of resource.
     * 
     */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * @return The function language
     * 
     */
    public Optional<String> language() {
        return Optional.ofNullable(this.language);
    }
    /**
     * @return Resource Name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Script URI.
     * 
     */
    public Optional<String> scriptHref() {
        return Optional.ofNullable(this.scriptHref);
    }
    /**
     * @return Script root path URI.
     * 
     */
    public Optional<String> scriptRootPathHref() {
        return Optional.ofNullable(this.scriptRootPathHref);
    }
    /**
     * @return Secrets file URI.
     * 
     */
    public Optional<String> secretsFileHref() {
        return Optional.ofNullable(this.secretsFileHref);
    }
    /**
     * @return Test data used when testing via the Azure Portal.
     * 
     */
    public Optional<String> testData() {
        return Optional.ofNullable(this.testData);
    }
    /**
     * @return Test data URI.
     * 
     */
    public Optional<String> testDataHref() {
        return Optional.ofNullable(this.testDataHref);
    }
    /**
     * @return Resource type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebAppFunctionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object config;
        private @Nullable String configHref;
        private @Nullable Map<String,String> files;
        private @Nullable String functionAppId;
        private @Nullable String href;
        private String id;
        private @Nullable String invokeUrlTemplate;
        private @Nullable Boolean isDisabled;
        private @Nullable String kind;
        private @Nullable String language;
        private String name;
        private @Nullable String scriptHref;
        private @Nullable String scriptRootPathHref;
        private @Nullable String secretsFileHref;
        private @Nullable String testData;
        private @Nullable String testDataHref;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebAppFunctionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
    	      this.configHref = defaults.configHref;
    	      this.files = defaults.files;
    	      this.functionAppId = defaults.functionAppId;
    	      this.href = defaults.href;
    	      this.id = defaults.id;
    	      this.invokeUrlTemplate = defaults.invokeUrlTemplate;
    	      this.isDisabled = defaults.isDisabled;
    	      this.kind = defaults.kind;
    	      this.language = defaults.language;
    	      this.name = defaults.name;
    	      this.scriptHref = defaults.scriptHref;
    	      this.scriptRootPathHref = defaults.scriptRootPathHref;
    	      this.secretsFileHref = defaults.secretsFileHref;
    	      this.testData = defaults.testData;
    	      this.testDataHref = defaults.testDataHref;
    	      this.type = defaults.type;
        }

        public Builder config(@Nullable Object config) {
            this.config = config;
            return this;
        }
        public Builder configHref(@Nullable String configHref) {
            this.configHref = configHref;
            return this;
        }
        public Builder files(@Nullable Map<String,String> files) {
            this.files = files;
            return this;
        }
        public Builder functionAppId(@Nullable String functionAppId) {
            this.functionAppId = functionAppId;
            return this;
        }
        public Builder href(@Nullable String href) {
            this.href = href;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder invokeUrlTemplate(@Nullable String invokeUrlTemplate) {
            this.invokeUrlTemplate = invokeUrlTemplate;
            return this;
        }
        public Builder isDisabled(@Nullable Boolean isDisabled) {
            this.isDisabled = isDisabled;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }
        public Builder language(@Nullable String language) {
            this.language = language;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder scriptHref(@Nullable String scriptHref) {
            this.scriptHref = scriptHref;
            return this;
        }
        public Builder scriptRootPathHref(@Nullable String scriptRootPathHref) {
            this.scriptRootPathHref = scriptRootPathHref;
            return this;
        }
        public Builder secretsFileHref(@Nullable String secretsFileHref) {
            this.secretsFileHref = secretsFileHref;
            return this;
        }
        public Builder testData(@Nullable String testData) {
            this.testData = testData;
            return this;
        }
        public Builder testDataHref(@Nullable String testDataHref) {
            this.testDataHref = testDataHref;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetWebAppFunctionResult build() {
            return new GetWebAppFunctionResult(config, configHref, files, functionAppId, href, id, invokeUrlTemplate, isDisabled, kind, language, name, scriptHref, scriptRootPathHref, secretsFileHref, testData, testDataHref, type);
        }
    }
}
