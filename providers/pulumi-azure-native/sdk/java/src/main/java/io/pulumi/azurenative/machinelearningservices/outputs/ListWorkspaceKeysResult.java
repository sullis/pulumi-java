// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.azurenative.machinelearningservices.outputs.ListNotebookKeysResultResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.RegistryListCredentialsResultResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ListWorkspaceKeysResult {
    private final String appInsightsInstrumentationKey;
    private final RegistryListCredentialsResultResponse containerRegistryCredentials;
    private final ListNotebookKeysResultResponse notebookAccessKeys;
    private final String userStorageKey;
    private final String userStorageResourceId;

    @OutputCustomType.Constructor({"appInsightsInstrumentationKey","containerRegistryCredentials","notebookAccessKeys","userStorageKey","userStorageResourceId"})
    private ListWorkspaceKeysResult(
        String appInsightsInstrumentationKey,
        RegistryListCredentialsResultResponse containerRegistryCredentials,
        ListNotebookKeysResultResponse notebookAccessKeys,
        String userStorageKey,
        String userStorageResourceId) {
        this.appInsightsInstrumentationKey = Objects.requireNonNull(appInsightsInstrumentationKey);
        this.containerRegistryCredentials = Objects.requireNonNull(containerRegistryCredentials);
        this.notebookAccessKeys = Objects.requireNonNull(notebookAccessKeys);
        this.userStorageKey = Objects.requireNonNull(userStorageKey);
        this.userStorageResourceId = Objects.requireNonNull(userStorageResourceId);
    }

    public String getAppInsightsInstrumentationKey() {
        return this.appInsightsInstrumentationKey;
    }
    public RegistryListCredentialsResultResponse getContainerRegistryCredentials() {
        return this.containerRegistryCredentials;
    }
    public ListNotebookKeysResultResponse getNotebookAccessKeys() {
        return this.notebookAccessKeys;
    }
    public String getUserStorageKey() {
        return this.userStorageKey;
    }
    public String getUserStorageResourceId() {
        return this.userStorageResourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListWorkspaceKeysResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String appInsightsInstrumentationKey;
        private RegistryListCredentialsResultResponse containerRegistryCredentials;
        private ListNotebookKeysResultResponse notebookAccessKeys;
        private String userStorageKey;
        private String userStorageResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(ListWorkspaceKeysResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appInsightsInstrumentationKey = defaults.appInsightsInstrumentationKey;
    	      this.containerRegistryCredentials = defaults.containerRegistryCredentials;
    	      this.notebookAccessKeys = defaults.notebookAccessKeys;
    	      this.userStorageKey = defaults.userStorageKey;
    	      this.userStorageResourceId = defaults.userStorageResourceId;
        }

        public Builder setAppInsightsInstrumentationKey(String appInsightsInstrumentationKey) {
            this.appInsightsInstrumentationKey = Objects.requireNonNull(appInsightsInstrumentationKey);
            return this;
        }

        public Builder setContainerRegistryCredentials(RegistryListCredentialsResultResponse containerRegistryCredentials) {
            this.containerRegistryCredentials = Objects.requireNonNull(containerRegistryCredentials);
            return this;
        }

        public Builder setNotebookAccessKeys(ListNotebookKeysResultResponse notebookAccessKeys) {
            this.notebookAccessKeys = Objects.requireNonNull(notebookAccessKeys);
            return this;
        }

        public Builder setUserStorageKey(String userStorageKey) {
            this.userStorageKey = Objects.requireNonNull(userStorageKey);
            return this;
        }

        public Builder setUserStorageResourceId(String userStorageResourceId) {
            this.userStorageResourceId = Objects.requireNonNull(userStorageResourceId);
            return this;
        }
        public ListWorkspaceKeysResult build() {
            return new ListWorkspaceKeysResult(appInsightsInstrumentationKey, containerRegistryCredentials, notebookAccessKeys, userStorageKey, userStorageResourceId);
        }
    }
}