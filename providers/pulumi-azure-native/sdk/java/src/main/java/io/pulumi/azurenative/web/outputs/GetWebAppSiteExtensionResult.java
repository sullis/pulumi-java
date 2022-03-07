// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetWebAppSiteExtensionResult {
    /**
     * List of authors.
     * 
     */
    private final @Nullable List<String> authors;
    /**
     * Site Extension comment.
     * 
     */
    private final @Nullable String comment;
    /**
     * Detailed description.
     * 
     */
    private final @Nullable String description;
    /**
     * Count of downloads.
     * 
     */
    private final @Nullable Integer downloadCount;
    /**
     * Site extension ID.
     * 
     */
    private final @Nullable String extensionId;
    /**
     * Site extension type.
     * 
     */
    private final @Nullable String extensionType;
    /**
     * Extension URL.
     * 
     */
    private final @Nullable String extensionUrl;
    /**
     * Feed URL.
     * 
     */
    private final @Nullable String feedUrl;
    /**
     * Icon URL.
     * 
     */
    private final @Nullable String iconUrl;
    /**
     * Resource Id.
     * 
     */
    private final String id;
    /**
     * Installed timestamp.
     * 
     */
    private final @Nullable String installedDateTime;
    /**
     * Installer command line parameters.
     * 
     */
    private final @Nullable String installerCommandLineParams;
    /**
     * Kind of resource.
     * 
     */
    private final @Nullable String kind;
    /**
     * License URL.
     * 
     */
    private final @Nullable String licenseUrl;
    /**
     * <code>true</code> if the local version is the latest version; <code>false</code> otherwise.
     * 
     */
    private final @Nullable Boolean localIsLatestVersion;
    /**
     * Local path.
     * 
     */
    private final @Nullable String localPath;
    /**
     * Resource Name.
     * 
     */
    private final String name;
    /**
     * Project URL.
     * 
     */
    private final @Nullable String projectUrl;
    /**
     * Provisioning state.
     * 
     */
    private final @Nullable String provisioningState;
    /**
     * Published timestamp.
     * 
     */
    private final @Nullable String publishedDateTime;
    /**
     * Summary description.
     * 
     */
    private final @Nullable String summary;
    private final @Nullable String title;
    /**
     * Resource type.
     * 
     */
    private final String type;
    /**
     * Version information.
     * 
     */
    private final @Nullable String version;

    @OutputCustomType.Constructor({"authors","comment","description","downloadCount","extensionId","extensionType","extensionUrl","feedUrl","iconUrl","id","installedDateTime","installerCommandLineParams","kind","licenseUrl","localIsLatestVersion","localPath","name","projectUrl","provisioningState","publishedDateTime","summary","title","type","version"})
    private GetWebAppSiteExtensionResult(
        @Nullable List<String> authors,
        @Nullable String comment,
        @Nullable String description,
        @Nullable Integer downloadCount,
        @Nullable String extensionId,
        @Nullable String extensionType,
        @Nullable String extensionUrl,
        @Nullable String feedUrl,
        @Nullable String iconUrl,
        String id,
        @Nullable String installedDateTime,
        @Nullable String installerCommandLineParams,
        @Nullable String kind,
        @Nullable String licenseUrl,
        @Nullable Boolean localIsLatestVersion,
        @Nullable String localPath,
        String name,
        @Nullable String projectUrl,
        @Nullable String provisioningState,
        @Nullable String publishedDateTime,
        @Nullable String summary,
        @Nullable String title,
        String type,
        @Nullable String version) {
        this.authors = authors;
        this.comment = comment;
        this.description = description;
        this.downloadCount = downloadCount;
        this.extensionId = extensionId;
        this.extensionType = extensionType;
        this.extensionUrl = extensionUrl;
        this.feedUrl = feedUrl;
        this.iconUrl = iconUrl;
        this.id = Objects.requireNonNull(id);
        this.installedDateTime = installedDateTime;
        this.installerCommandLineParams = installerCommandLineParams;
        this.kind = kind;
        this.licenseUrl = licenseUrl;
        this.localIsLatestVersion = localIsLatestVersion;
        this.localPath = localPath;
        this.name = Objects.requireNonNull(name);
        this.projectUrl = projectUrl;
        this.provisioningState = provisioningState;
        this.publishedDateTime = publishedDateTime;
        this.summary = summary;
        this.title = title;
        this.type = Objects.requireNonNull(type);
        this.version = version;
    }

    /**
     * List of authors.
     * 
    */
    public List<String> getAuthors() {
        return this.authors == null ? List.of() : this.authors;
    }
    /**
     * Site Extension comment.
     * 
    */
    public Optional<String> getComment() {
        return Optional.ofNullable(this.comment);
    }
    /**
     * Detailed description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Count of downloads.
     * 
    */
    public Optional<Integer> getDownloadCount() {
        return Optional.ofNullable(this.downloadCount);
    }
    /**
     * Site extension ID.
     * 
    */
    public Optional<String> getExtensionId() {
        return Optional.ofNullable(this.extensionId);
    }
    /**
     * Site extension type.
     * 
    */
    public Optional<String> getExtensionType() {
        return Optional.ofNullable(this.extensionType);
    }
    /**
     * Extension URL.
     * 
    */
    public Optional<String> getExtensionUrl() {
        return Optional.ofNullable(this.extensionUrl);
    }
    /**
     * Feed URL.
     * 
    */
    public Optional<String> getFeedUrl() {
        return Optional.ofNullable(this.feedUrl);
    }
    /**
     * Icon URL.
     * 
    */
    public Optional<String> getIconUrl() {
        return Optional.ofNullable(this.iconUrl);
    }
    /**
     * Resource Id.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Installed timestamp.
     * 
    */
    public Optional<String> getInstalledDateTime() {
        return Optional.ofNullable(this.installedDateTime);
    }
    /**
     * Installer command line parameters.
     * 
    */
    public Optional<String> getInstallerCommandLineParams() {
        return Optional.ofNullable(this.installerCommandLineParams);
    }
    /**
     * Kind of resource.
     * 
    */
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * License URL.
     * 
    */
    public Optional<String> getLicenseUrl() {
        return Optional.ofNullable(this.licenseUrl);
    }
    /**
     * <code>true</code> if the local version is the latest version; <code>false</code> otherwise.
     * 
    */
    public Optional<Boolean> getLocalIsLatestVersion() {
        return Optional.ofNullable(this.localIsLatestVersion);
    }
    /**
     * Local path.
     * 
    */
    public Optional<String> getLocalPath() {
        return Optional.ofNullable(this.localPath);
    }
    /**
     * Resource Name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Project URL.
     * 
    */
    public Optional<String> getProjectUrl() {
        return Optional.ofNullable(this.projectUrl);
    }
    /**
     * Provisioning state.
     * 
    */
    public Optional<String> getProvisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }
    /**
     * Published timestamp.
     * 
    */
    public Optional<String> getPublishedDateTime() {
        return Optional.ofNullable(this.publishedDateTime);
    }
    /**
     * Summary description.
     * 
    */
    public Optional<String> getSummary() {
        return Optional.ofNullable(this.summary);
    }
    public Optional<String> getTitle() {
        return Optional.ofNullable(this.title);
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Version information.
     * 
    */
    public Optional<String> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebAppSiteExtensionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> authors;
        private @Nullable String comment;
        private @Nullable String description;
        private @Nullable Integer downloadCount;
        private @Nullable String extensionId;
        private @Nullable String extensionType;
        private @Nullable String extensionUrl;
        private @Nullable String feedUrl;
        private @Nullable String iconUrl;
        private String id;
        private @Nullable String installedDateTime;
        private @Nullable String installerCommandLineParams;
        private @Nullable String kind;
        private @Nullable String licenseUrl;
        private @Nullable Boolean localIsLatestVersion;
        private @Nullable String localPath;
        private String name;
        private @Nullable String projectUrl;
        private @Nullable String provisioningState;
        private @Nullable String publishedDateTime;
        private @Nullable String summary;
        private @Nullable String title;
        private String type;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebAppSiteExtensionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authors = defaults.authors;
    	      this.comment = defaults.comment;
    	      this.description = defaults.description;
    	      this.downloadCount = defaults.downloadCount;
    	      this.extensionId = defaults.extensionId;
    	      this.extensionType = defaults.extensionType;
    	      this.extensionUrl = defaults.extensionUrl;
    	      this.feedUrl = defaults.feedUrl;
    	      this.iconUrl = defaults.iconUrl;
    	      this.id = defaults.id;
    	      this.installedDateTime = defaults.installedDateTime;
    	      this.installerCommandLineParams = defaults.installerCommandLineParams;
    	      this.kind = defaults.kind;
    	      this.licenseUrl = defaults.licenseUrl;
    	      this.localIsLatestVersion = defaults.localIsLatestVersion;
    	      this.localPath = defaults.localPath;
    	      this.name = defaults.name;
    	      this.projectUrl = defaults.projectUrl;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publishedDateTime = defaults.publishedDateTime;
    	      this.summary = defaults.summary;
    	      this.title = defaults.title;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder setAuthors(@Nullable List<String> authors) {
            this.authors = authors;
            return this;
        }

        public Builder setComment(@Nullable String comment) {
            this.comment = comment;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDownloadCount(@Nullable Integer downloadCount) {
            this.downloadCount = downloadCount;
            return this;
        }

        public Builder setExtensionId(@Nullable String extensionId) {
            this.extensionId = extensionId;
            return this;
        }

        public Builder setExtensionType(@Nullable String extensionType) {
            this.extensionType = extensionType;
            return this;
        }

        public Builder setExtensionUrl(@Nullable String extensionUrl) {
            this.extensionUrl = extensionUrl;
            return this;
        }

        public Builder setFeedUrl(@Nullable String feedUrl) {
            this.feedUrl = feedUrl;
            return this;
        }

        public Builder setIconUrl(@Nullable String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setInstalledDateTime(@Nullable String installedDateTime) {
            this.installedDateTime = installedDateTime;
            return this;
        }

        public Builder setInstallerCommandLineParams(@Nullable String installerCommandLineParams) {
            this.installerCommandLineParams = installerCommandLineParams;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder setLicenseUrl(@Nullable String licenseUrl) {
            this.licenseUrl = licenseUrl;
            return this;
        }

        public Builder setLocalIsLatestVersion(@Nullable Boolean localIsLatestVersion) {
            this.localIsLatestVersion = localIsLatestVersion;
            return this;
        }

        public Builder setLocalPath(@Nullable String localPath) {
            this.localPath = localPath;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProjectUrl(@Nullable String projectUrl) {
            this.projectUrl = projectUrl;
            return this;
        }

        public Builder setProvisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder setPublishedDateTime(@Nullable String publishedDateTime) {
            this.publishedDateTime = publishedDateTime;
            return this;
        }

        public Builder setSummary(@Nullable String summary) {
            this.summary = summary;
            return this;
        }

        public Builder setTitle(@Nullable String title) {
            this.title = title;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = version;
            return this;
        }
        public GetWebAppSiteExtensionResult build() {
            return new GetWebAppSiteExtensionResult(authors, comment, description, downloadCount, extensionId, extensionType, extensionUrl, feedUrl, iconUrl, id, installedDateTime, installerCommandLineParams, kind, licenseUrl, localIsLatestVersion, localPath, name, projectUrl, provisioningState, publishedDateTime, summary, title, type, version);
        }
    }
}