// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.workspaces.outputs;

import io.pulumi.aws.workspaces.outputs.GetWorkspaceWorkspaceProperty;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetWorkspaceResult {
    private final String bundleId;
    /**
     * The name of the WorkSpace, as seen by the operating system.
     * 
     */
    private final String computerName;
    private final String directoryId;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * The IP address of the WorkSpace.
     * 
     */
    private final String ipAddress;
    private final Boolean rootVolumeEncryptionEnabled;
    /**
     * The operational state of the WorkSpace.
     * 
     */
    private final String state;
    private final Map<String,String> tags;
    private final String userName;
    private final Boolean userVolumeEncryptionEnabled;
    private final String volumeEncryptionKey;
    private final String workspaceId;
    private final List<GetWorkspaceWorkspaceProperty> workspaceProperties;

    @OutputCustomType.Constructor({"bundleId","computerName","directoryId","id","ipAddress","rootVolumeEncryptionEnabled","state","tags","userName","userVolumeEncryptionEnabled","volumeEncryptionKey","workspaceId","workspaceProperties"})
    private GetWorkspaceResult(
        String bundleId,
        String computerName,
        String directoryId,
        String id,
        String ipAddress,
        Boolean rootVolumeEncryptionEnabled,
        String state,
        Map<String,String> tags,
        String userName,
        Boolean userVolumeEncryptionEnabled,
        String volumeEncryptionKey,
        String workspaceId,
        List<GetWorkspaceWorkspaceProperty> workspaceProperties) {
        this.bundleId = Objects.requireNonNull(bundleId);
        this.computerName = Objects.requireNonNull(computerName);
        this.directoryId = Objects.requireNonNull(directoryId);
        this.id = Objects.requireNonNull(id);
        this.ipAddress = Objects.requireNonNull(ipAddress);
        this.rootVolumeEncryptionEnabled = Objects.requireNonNull(rootVolumeEncryptionEnabled);
        this.state = Objects.requireNonNull(state);
        this.tags = Objects.requireNonNull(tags);
        this.userName = Objects.requireNonNull(userName);
        this.userVolumeEncryptionEnabled = Objects.requireNonNull(userVolumeEncryptionEnabled);
        this.volumeEncryptionKey = Objects.requireNonNull(volumeEncryptionKey);
        this.workspaceId = Objects.requireNonNull(workspaceId);
        this.workspaceProperties = Objects.requireNonNull(workspaceProperties);
    }

    public String getBundleId() {
        return this.bundleId;
    }
    /**
     * The name of the WorkSpace, as seen by the operating system.
     * 
    */
    public String getComputerName() {
        return this.computerName;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The IP address of the WorkSpace.
     * 
    */
    public String getIpAddress() {
        return this.ipAddress;
    }
    public Boolean getRootVolumeEncryptionEnabled() {
        return this.rootVolumeEncryptionEnabled;
    }
    /**
     * The operational state of the WorkSpace.
     * 
    */
    public String getState() {
        return this.state;
    }
    public Map<String,String> getTags() {
        return this.tags;
    }
    public String getUserName() {
        return this.userName;
    }
    public Boolean getUserVolumeEncryptionEnabled() {
        return this.userVolumeEncryptionEnabled;
    }
    public String getVolumeEncryptionKey() {
        return this.volumeEncryptionKey;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }
    public List<GetWorkspaceWorkspaceProperty> getWorkspaceProperties() {
        return this.workspaceProperties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkspaceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bundleId;
        private String computerName;
        private String directoryId;
        private String id;
        private String ipAddress;
        private Boolean rootVolumeEncryptionEnabled;
        private String state;
        private Map<String,String> tags;
        private String userName;
        private Boolean userVolumeEncryptionEnabled;
        private String volumeEncryptionKey;
        private String workspaceId;
        private List<GetWorkspaceWorkspaceProperty> workspaceProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkspaceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bundleId = defaults.bundleId;
    	      this.computerName = defaults.computerName;
    	      this.directoryId = defaults.directoryId;
    	      this.id = defaults.id;
    	      this.ipAddress = defaults.ipAddress;
    	      this.rootVolumeEncryptionEnabled = defaults.rootVolumeEncryptionEnabled;
    	      this.state = defaults.state;
    	      this.tags = defaults.tags;
    	      this.userName = defaults.userName;
    	      this.userVolumeEncryptionEnabled = defaults.userVolumeEncryptionEnabled;
    	      this.volumeEncryptionKey = defaults.volumeEncryptionKey;
    	      this.workspaceId = defaults.workspaceId;
    	      this.workspaceProperties = defaults.workspaceProperties;
        }

        public Builder setBundleId(String bundleId) {
            this.bundleId = Objects.requireNonNull(bundleId);
            return this;
        }

        public Builder setComputerName(String computerName) {
            this.computerName = Objects.requireNonNull(computerName);
            return this;
        }

        public Builder setDirectoryId(String directoryId) {
            this.directoryId = Objects.requireNonNull(directoryId);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIpAddress(String ipAddress) {
            this.ipAddress = Objects.requireNonNull(ipAddress);
            return this;
        }

        public Builder setRootVolumeEncryptionEnabled(Boolean rootVolumeEncryptionEnabled) {
            this.rootVolumeEncryptionEnabled = Objects.requireNonNull(rootVolumeEncryptionEnabled);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setTags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public Builder setUserName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }

        public Builder setUserVolumeEncryptionEnabled(Boolean userVolumeEncryptionEnabled) {
            this.userVolumeEncryptionEnabled = Objects.requireNonNull(userVolumeEncryptionEnabled);
            return this;
        }

        public Builder setVolumeEncryptionKey(String volumeEncryptionKey) {
            this.volumeEncryptionKey = Objects.requireNonNull(volumeEncryptionKey);
            return this;
        }

        public Builder setWorkspaceId(String workspaceId) {
            this.workspaceId = Objects.requireNonNull(workspaceId);
            return this;
        }

        public Builder setWorkspaceProperties(List<GetWorkspaceWorkspaceProperty> workspaceProperties) {
            this.workspaceProperties = Objects.requireNonNull(workspaceProperties);
            return this;
        }
        public GetWorkspaceResult build() {
            return new GetWorkspaceResult(bundleId, computerName, directoryId, id, ipAddress, rootVolumeEncryptionEnabled, state, tags, userName, userVolumeEncryptionEnabled, volumeEncryptionKey, workspaceId, workspaceProperties);
        }
    }
}