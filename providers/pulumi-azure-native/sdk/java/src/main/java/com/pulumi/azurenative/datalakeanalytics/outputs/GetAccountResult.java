// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datalakeanalytics.outputs;

import com.pulumi.azurenative.datalakeanalytics.outputs.ComputePolicyResponse;
import com.pulumi.azurenative.datalakeanalytics.outputs.DataLakeStoreAccountInformationResponse;
import com.pulumi.azurenative.datalakeanalytics.outputs.FirewallRuleResponse;
import com.pulumi.azurenative.datalakeanalytics.outputs.HiveMetastoreResponse;
import com.pulumi.azurenative.datalakeanalytics.outputs.StorageAccountInformationResponse;
import com.pulumi.azurenative.datalakeanalytics.outputs.VirtualNetworkRuleResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAccountResult {
    /**
     * @return The unique identifier associated with this Data Lake Analytics account.
     * 
     */
    private final String accountId;
    /**
     * @return The list of compute policies associated with this account.
     * 
     */
    private final List<ComputePolicyResponse> computePolicies;
    /**
     * @return The account creation time.
     * 
     */
    private final String creationTime;
    /**
     * @return The commitment tier in use for the current month.
     * 
     */
    private final String currentTier;
    /**
     * @return The list of Data Lake Store accounts associated with this account.
     * 
     */
    private final List<DataLakeStoreAccountInformationResponse> dataLakeStoreAccounts;
    /**
     * @return The current state of the DebugDataAccessLevel for this account.
     * 
     */
    private final String debugDataAccessLevel;
    /**
     * @return The default Data Lake Store account associated with this account.
     * 
     */
    private final String defaultDataLakeStoreAccount;
    /**
     * @return The full CName endpoint for this account.
     * 
     */
    private final String endpoint;
    /**
     * @return The current state of allowing or disallowing IPs originating within Azure through the firewall. If the firewall is disabled, this is not enforced.
     * 
     */
    private final @Nullable String firewallAllowAzureIps;
    /**
     * @return The list of firewall rules associated with this account.
     * 
     */
    private final List<FirewallRuleResponse> firewallRules;
    /**
     * @return The current state of the IP address firewall for this account.
     * 
     */
    private final @Nullable String firewallState;
    /**
     * @return The list of hiveMetastores associated with this account.
     * 
     */
    private final List<HiveMetastoreResponse> hiveMetastores;
    /**
     * @return The resource identifier.
     * 
     */
    private final String id;
    /**
     * @return The account last modified time.
     * 
     */
    private final String lastModifiedTime;
    /**
     * @return The resource location.
     * 
     */
    private final String location;
    /**
     * @return The maximum supported active jobs under the account at the same time.
     * 
     */
    private final Integer maxActiveJobCountPerUser;
    /**
     * @return The maximum supported degree of parallelism for this account.
     * 
     */
    private final @Nullable Integer maxDegreeOfParallelism;
    /**
     * @return The maximum supported degree of parallelism per job for this account.
     * 
     */
    private final @Nullable Integer maxDegreeOfParallelismPerJob;
    /**
     * @return The maximum supported jobs running under the account at the same time.
     * 
     */
    private final @Nullable Integer maxJobCount;
    /**
     * @return The maximum supported active jobs under the account at the same time.
     * 
     */
    private final Integer maxJobRunningTimeInMin;
    /**
     * @return The maximum supported jobs queued under the account at the same time.
     * 
     */
    private final Integer maxQueuedJobCountPerUser;
    /**
     * @return The minimum supported priority per job for this account.
     * 
     */
    private final Integer minPriorityPerJob;
    /**
     * @return The resource name.
     * 
     */
    private final String name;
    /**
     * @return The commitment tier for the next month.
     * 
     */
    private final @Nullable String newTier;
    /**
     * @return The provisioning status of the Data Lake Analytics account.
     * 
     */
    private final String provisioningState;
    /**
     * @return The list of Data Lake Store accounts associated with this account.
     * 
     */
    private final @Nullable List<DataLakeStoreAccountInformationResponse> publicDataLakeStoreAccounts;
    /**
     * @return The number of days that job metadata is retained.
     * 
     */
    private final @Nullable Integer queryStoreRetention;
    /**
     * @return The state of the Data Lake Analytics account.
     * 
     */
    private final String state;
    /**
     * @return The list of Azure Blob Storage accounts associated with this account.
     * 
     */
    private final List<StorageAccountInformationResponse> storageAccounts;
    /**
     * @return The system defined maximum supported degree of parallelism for this account, which restricts the maximum value of parallelism the user can set for the account.
     * 
     */
    private final Integer systemMaxDegreeOfParallelism;
    /**
     * @return The system defined maximum supported jobs running under the account at the same time, which restricts the maximum number of running jobs the user can set for the account.
     * 
     */
    private final Integer systemMaxJobCount;
    /**
     * @return The resource tags.
     * 
     */
    private final Map<String,String> tags;
    /**
     * @return The resource type.
     * 
     */
    private final String type;
    /**
     * @return The list of virtualNetwork rules associated with this account.
     * 
     */
    private final List<VirtualNetworkRuleResponse> virtualNetworkRules;

    @CustomType.Constructor
    private GetAccountResult(
        @CustomType.Parameter("accountId") String accountId,
        @CustomType.Parameter("computePolicies") List<ComputePolicyResponse> computePolicies,
        @CustomType.Parameter("creationTime") String creationTime,
        @CustomType.Parameter("currentTier") String currentTier,
        @CustomType.Parameter("dataLakeStoreAccounts") List<DataLakeStoreAccountInformationResponse> dataLakeStoreAccounts,
        @CustomType.Parameter("debugDataAccessLevel") String debugDataAccessLevel,
        @CustomType.Parameter("defaultDataLakeStoreAccount") String defaultDataLakeStoreAccount,
        @CustomType.Parameter("endpoint") String endpoint,
        @CustomType.Parameter("firewallAllowAzureIps") @Nullable String firewallAllowAzureIps,
        @CustomType.Parameter("firewallRules") List<FirewallRuleResponse> firewallRules,
        @CustomType.Parameter("firewallState") @Nullable String firewallState,
        @CustomType.Parameter("hiveMetastores") List<HiveMetastoreResponse> hiveMetastores,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("lastModifiedTime") String lastModifiedTime,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("maxActiveJobCountPerUser") Integer maxActiveJobCountPerUser,
        @CustomType.Parameter("maxDegreeOfParallelism") @Nullable Integer maxDegreeOfParallelism,
        @CustomType.Parameter("maxDegreeOfParallelismPerJob") @Nullable Integer maxDegreeOfParallelismPerJob,
        @CustomType.Parameter("maxJobCount") @Nullable Integer maxJobCount,
        @CustomType.Parameter("maxJobRunningTimeInMin") Integer maxJobRunningTimeInMin,
        @CustomType.Parameter("maxQueuedJobCountPerUser") Integer maxQueuedJobCountPerUser,
        @CustomType.Parameter("minPriorityPerJob") Integer minPriorityPerJob,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("newTier") @Nullable String newTier,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("publicDataLakeStoreAccounts") @Nullable List<DataLakeStoreAccountInformationResponse> publicDataLakeStoreAccounts,
        @CustomType.Parameter("queryStoreRetention") @Nullable Integer queryStoreRetention,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("storageAccounts") List<StorageAccountInformationResponse> storageAccounts,
        @CustomType.Parameter("systemMaxDegreeOfParallelism") Integer systemMaxDegreeOfParallelism,
        @CustomType.Parameter("systemMaxJobCount") Integer systemMaxJobCount,
        @CustomType.Parameter("tags") Map<String,String> tags,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("virtualNetworkRules") List<VirtualNetworkRuleResponse> virtualNetworkRules) {
        this.accountId = accountId;
        this.computePolicies = computePolicies;
        this.creationTime = creationTime;
        this.currentTier = currentTier;
        this.dataLakeStoreAccounts = dataLakeStoreAccounts;
        this.debugDataAccessLevel = debugDataAccessLevel;
        this.defaultDataLakeStoreAccount = defaultDataLakeStoreAccount;
        this.endpoint = endpoint;
        this.firewallAllowAzureIps = firewallAllowAzureIps;
        this.firewallRules = firewallRules;
        this.firewallState = firewallState;
        this.hiveMetastores = hiveMetastores;
        this.id = id;
        this.lastModifiedTime = lastModifiedTime;
        this.location = location;
        this.maxActiveJobCountPerUser = maxActiveJobCountPerUser;
        this.maxDegreeOfParallelism = maxDegreeOfParallelism;
        this.maxDegreeOfParallelismPerJob = maxDegreeOfParallelismPerJob;
        this.maxJobCount = maxJobCount;
        this.maxJobRunningTimeInMin = maxJobRunningTimeInMin;
        this.maxQueuedJobCountPerUser = maxQueuedJobCountPerUser;
        this.minPriorityPerJob = minPriorityPerJob;
        this.name = name;
        this.newTier = newTier;
        this.provisioningState = provisioningState;
        this.publicDataLakeStoreAccounts = publicDataLakeStoreAccounts;
        this.queryStoreRetention = queryStoreRetention;
        this.state = state;
        this.storageAccounts = storageAccounts;
        this.systemMaxDegreeOfParallelism = systemMaxDegreeOfParallelism;
        this.systemMaxJobCount = systemMaxJobCount;
        this.tags = tags;
        this.type = type;
        this.virtualNetworkRules = virtualNetworkRules;
    }

    /**
     * @return The unique identifier associated with this Data Lake Analytics account.
     * 
     */
    public String accountId() {
        return this.accountId;
    }
    /**
     * @return The list of compute policies associated with this account.
     * 
     */
    public List<ComputePolicyResponse> computePolicies() {
        return this.computePolicies;
    }
    /**
     * @return The account creation time.
     * 
     */
    public String creationTime() {
        return this.creationTime;
    }
    /**
     * @return The commitment tier in use for the current month.
     * 
     */
    public String currentTier() {
        return this.currentTier;
    }
    /**
     * @return The list of Data Lake Store accounts associated with this account.
     * 
     */
    public List<DataLakeStoreAccountInformationResponse> dataLakeStoreAccounts() {
        return this.dataLakeStoreAccounts;
    }
    /**
     * @return The current state of the DebugDataAccessLevel for this account.
     * 
     */
    public String debugDataAccessLevel() {
        return this.debugDataAccessLevel;
    }
    /**
     * @return The default Data Lake Store account associated with this account.
     * 
     */
    public String defaultDataLakeStoreAccount() {
        return this.defaultDataLakeStoreAccount;
    }
    /**
     * @return The full CName endpoint for this account.
     * 
     */
    public String endpoint() {
        return this.endpoint;
    }
    /**
     * @return The current state of allowing or disallowing IPs originating within Azure through the firewall. If the firewall is disabled, this is not enforced.
     * 
     */
    public Optional<String> firewallAllowAzureIps() {
        return Optional.ofNullable(this.firewallAllowAzureIps);
    }
    /**
     * @return The list of firewall rules associated with this account.
     * 
     */
    public List<FirewallRuleResponse> firewallRules() {
        return this.firewallRules;
    }
    /**
     * @return The current state of the IP address firewall for this account.
     * 
     */
    public Optional<String> firewallState() {
        return Optional.ofNullable(this.firewallState);
    }
    /**
     * @return The list of hiveMetastores associated with this account.
     * 
     */
    public List<HiveMetastoreResponse> hiveMetastores() {
        return this.hiveMetastores;
    }
    /**
     * @return The resource identifier.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The account last modified time.
     * 
     */
    public String lastModifiedTime() {
        return this.lastModifiedTime;
    }
    /**
     * @return The resource location.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return The maximum supported active jobs under the account at the same time.
     * 
     */
    public Integer maxActiveJobCountPerUser() {
        return this.maxActiveJobCountPerUser;
    }
    /**
     * @return The maximum supported degree of parallelism for this account.
     * 
     */
    public Optional<Integer> maxDegreeOfParallelism() {
        return Optional.ofNullable(this.maxDegreeOfParallelism);
    }
    /**
     * @return The maximum supported degree of parallelism per job for this account.
     * 
     */
    public Optional<Integer> maxDegreeOfParallelismPerJob() {
        return Optional.ofNullable(this.maxDegreeOfParallelismPerJob);
    }
    /**
     * @return The maximum supported jobs running under the account at the same time.
     * 
     */
    public Optional<Integer> maxJobCount() {
        return Optional.ofNullable(this.maxJobCount);
    }
    /**
     * @return The maximum supported active jobs under the account at the same time.
     * 
     */
    public Integer maxJobRunningTimeInMin() {
        return this.maxJobRunningTimeInMin;
    }
    /**
     * @return The maximum supported jobs queued under the account at the same time.
     * 
     */
    public Integer maxQueuedJobCountPerUser() {
        return this.maxQueuedJobCountPerUser;
    }
    /**
     * @return The minimum supported priority per job for this account.
     * 
     */
    public Integer minPriorityPerJob() {
        return this.minPriorityPerJob;
    }
    /**
     * @return The resource name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The commitment tier for the next month.
     * 
     */
    public Optional<String> newTier() {
        return Optional.ofNullable(this.newTier);
    }
    /**
     * @return The provisioning status of the Data Lake Analytics account.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return The list of Data Lake Store accounts associated with this account.
     * 
     */
    public List<DataLakeStoreAccountInformationResponse> publicDataLakeStoreAccounts() {
        return this.publicDataLakeStoreAccounts == null ? List.of() : this.publicDataLakeStoreAccounts;
    }
    /**
     * @return The number of days that job metadata is retained.
     * 
     */
    public Optional<Integer> queryStoreRetention() {
        return Optional.ofNullable(this.queryStoreRetention);
    }
    /**
     * @return The state of the Data Lake Analytics account.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return The list of Azure Blob Storage accounts associated with this account.
     * 
     */
    public List<StorageAccountInformationResponse> storageAccounts() {
        return this.storageAccounts;
    }
    /**
     * @return The system defined maximum supported degree of parallelism for this account, which restricts the maximum value of parallelism the user can set for the account.
     * 
     */
    public Integer systemMaxDegreeOfParallelism() {
        return this.systemMaxDegreeOfParallelism;
    }
    /**
     * @return The system defined maximum supported jobs running under the account at the same time, which restricts the maximum number of running jobs the user can set for the account.
     * 
     */
    public Integer systemMaxJobCount() {
        return this.systemMaxJobCount;
    }
    /**
     * @return The resource tags.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return The resource type.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The list of virtualNetwork rules associated with this account.
     * 
     */
    public List<VirtualNetworkRuleResponse> virtualNetworkRules() {
        return this.virtualNetworkRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountId;
        private List<ComputePolicyResponse> computePolicies;
        private String creationTime;
        private String currentTier;
        private List<DataLakeStoreAccountInformationResponse> dataLakeStoreAccounts;
        private String debugDataAccessLevel;
        private String defaultDataLakeStoreAccount;
        private String endpoint;
        private @Nullable String firewallAllowAzureIps;
        private List<FirewallRuleResponse> firewallRules;
        private @Nullable String firewallState;
        private List<HiveMetastoreResponse> hiveMetastores;
        private String id;
        private String lastModifiedTime;
        private String location;
        private Integer maxActiveJobCountPerUser;
        private @Nullable Integer maxDegreeOfParallelism;
        private @Nullable Integer maxDegreeOfParallelismPerJob;
        private @Nullable Integer maxJobCount;
        private Integer maxJobRunningTimeInMin;
        private Integer maxQueuedJobCountPerUser;
        private Integer minPriorityPerJob;
        private String name;
        private @Nullable String newTier;
        private String provisioningState;
        private @Nullable List<DataLakeStoreAccountInformationResponse> publicDataLakeStoreAccounts;
        private @Nullable Integer queryStoreRetention;
        private String state;
        private List<StorageAccountInformationResponse> storageAccounts;
        private Integer systemMaxDegreeOfParallelism;
        private Integer systemMaxJobCount;
        private Map<String,String> tags;
        private String type;
        private List<VirtualNetworkRuleResponse> virtualNetworkRules;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccountResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.computePolicies = defaults.computePolicies;
    	      this.creationTime = defaults.creationTime;
    	      this.currentTier = defaults.currentTier;
    	      this.dataLakeStoreAccounts = defaults.dataLakeStoreAccounts;
    	      this.debugDataAccessLevel = defaults.debugDataAccessLevel;
    	      this.defaultDataLakeStoreAccount = defaults.defaultDataLakeStoreAccount;
    	      this.endpoint = defaults.endpoint;
    	      this.firewallAllowAzureIps = defaults.firewallAllowAzureIps;
    	      this.firewallRules = defaults.firewallRules;
    	      this.firewallState = defaults.firewallState;
    	      this.hiveMetastores = defaults.hiveMetastores;
    	      this.id = defaults.id;
    	      this.lastModifiedTime = defaults.lastModifiedTime;
    	      this.location = defaults.location;
    	      this.maxActiveJobCountPerUser = defaults.maxActiveJobCountPerUser;
    	      this.maxDegreeOfParallelism = defaults.maxDegreeOfParallelism;
    	      this.maxDegreeOfParallelismPerJob = defaults.maxDegreeOfParallelismPerJob;
    	      this.maxJobCount = defaults.maxJobCount;
    	      this.maxJobRunningTimeInMin = defaults.maxJobRunningTimeInMin;
    	      this.maxQueuedJobCountPerUser = defaults.maxQueuedJobCountPerUser;
    	      this.minPriorityPerJob = defaults.minPriorityPerJob;
    	      this.name = defaults.name;
    	      this.newTier = defaults.newTier;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicDataLakeStoreAccounts = defaults.publicDataLakeStoreAccounts;
    	      this.queryStoreRetention = defaults.queryStoreRetention;
    	      this.state = defaults.state;
    	      this.storageAccounts = defaults.storageAccounts;
    	      this.systemMaxDegreeOfParallelism = defaults.systemMaxDegreeOfParallelism;
    	      this.systemMaxJobCount = defaults.systemMaxJobCount;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.virtualNetworkRules = defaults.virtualNetworkRules;
        }

        public Builder accountId(String accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }
        public Builder computePolicies(List<ComputePolicyResponse> computePolicies) {
            this.computePolicies = Objects.requireNonNull(computePolicies);
            return this;
        }
        public Builder computePolicies(ComputePolicyResponse... computePolicies) {
            return computePolicies(List.of(computePolicies));
        }
        public Builder creationTime(String creationTime) {
            this.creationTime = Objects.requireNonNull(creationTime);
            return this;
        }
        public Builder currentTier(String currentTier) {
            this.currentTier = Objects.requireNonNull(currentTier);
            return this;
        }
        public Builder dataLakeStoreAccounts(List<DataLakeStoreAccountInformationResponse> dataLakeStoreAccounts) {
            this.dataLakeStoreAccounts = Objects.requireNonNull(dataLakeStoreAccounts);
            return this;
        }
        public Builder dataLakeStoreAccounts(DataLakeStoreAccountInformationResponse... dataLakeStoreAccounts) {
            return dataLakeStoreAccounts(List.of(dataLakeStoreAccounts));
        }
        public Builder debugDataAccessLevel(String debugDataAccessLevel) {
            this.debugDataAccessLevel = Objects.requireNonNull(debugDataAccessLevel);
            return this;
        }
        public Builder defaultDataLakeStoreAccount(String defaultDataLakeStoreAccount) {
            this.defaultDataLakeStoreAccount = Objects.requireNonNull(defaultDataLakeStoreAccount);
            return this;
        }
        public Builder endpoint(String endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }
        public Builder firewallAllowAzureIps(@Nullable String firewallAllowAzureIps) {
            this.firewallAllowAzureIps = firewallAllowAzureIps;
            return this;
        }
        public Builder firewallRules(List<FirewallRuleResponse> firewallRules) {
            this.firewallRules = Objects.requireNonNull(firewallRules);
            return this;
        }
        public Builder firewallRules(FirewallRuleResponse... firewallRules) {
            return firewallRules(List.of(firewallRules));
        }
        public Builder firewallState(@Nullable String firewallState) {
            this.firewallState = firewallState;
            return this;
        }
        public Builder hiveMetastores(List<HiveMetastoreResponse> hiveMetastores) {
            this.hiveMetastores = Objects.requireNonNull(hiveMetastores);
            return this;
        }
        public Builder hiveMetastores(HiveMetastoreResponse... hiveMetastores) {
            return hiveMetastores(List.of(hiveMetastores));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = Objects.requireNonNull(lastModifiedTime);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder maxActiveJobCountPerUser(Integer maxActiveJobCountPerUser) {
            this.maxActiveJobCountPerUser = Objects.requireNonNull(maxActiveJobCountPerUser);
            return this;
        }
        public Builder maxDegreeOfParallelism(@Nullable Integer maxDegreeOfParallelism) {
            this.maxDegreeOfParallelism = maxDegreeOfParallelism;
            return this;
        }
        public Builder maxDegreeOfParallelismPerJob(@Nullable Integer maxDegreeOfParallelismPerJob) {
            this.maxDegreeOfParallelismPerJob = maxDegreeOfParallelismPerJob;
            return this;
        }
        public Builder maxJobCount(@Nullable Integer maxJobCount) {
            this.maxJobCount = maxJobCount;
            return this;
        }
        public Builder maxJobRunningTimeInMin(Integer maxJobRunningTimeInMin) {
            this.maxJobRunningTimeInMin = Objects.requireNonNull(maxJobRunningTimeInMin);
            return this;
        }
        public Builder maxQueuedJobCountPerUser(Integer maxQueuedJobCountPerUser) {
            this.maxQueuedJobCountPerUser = Objects.requireNonNull(maxQueuedJobCountPerUser);
            return this;
        }
        public Builder minPriorityPerJob(Integer minPriorityPerJob) {
            this.minPriorityPerJob = Objects.requireNonNull(minPriorityPerJob);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder newTier(@Nullable String newTier) {
            this.newTier = newTier;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder publicDataLakeStoreAccounts(@Nullable List<DataLakeStoreAccountInformationResponse> publicDataLakeStoreAccounts) {
            this.publicDataLakeStoreAccounts = publicDataLakeStoreAccounts;
            return this;
        }
        public Builder publicDataLakeStoreAccounts(DataLakeStoreAccountInformationResponse... publicDataLakeStoreAccounts) {
            return publicDataLakeStoreAccounts(List.of(publicDataLakeStoreAccounts));
        }
        public Builder queryStoreRetention(@Nullable Integer queryStoreRetention) {
            this.queryStoreRetention = queryStoreRetention;
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder storageAccounts(List<StorageAccountInformationResponse> storageAccounts) {
            this.storageAccounts = Objects.requireNonNull(storageAccounts);
            return this;
        }
        public Builder storageAccounts(StorageAccountInformationResponse... storageAccounts) {
            return storageAccounts(List.of(storageAccounts));
        }
        public Builder systemMaxDegreeOfParallelism(Integer systemMaxDegreeOfParallelism) {
            this.systemMaxDegreeOfParallelism = Objects.requireNonNull(systemMaxDegreeOfParallelism);
            return this;
        }
        public Builder systemMaxJobCount(Integer systemMaxJobCount) {
            this.systemMaxJobCount = Objects.requireNonNull(systemMaxJobCount);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder virtualNetworkRules(List<VirtualNetworkRuleResponse> virtualNetworkRules) {
            this.virtualNetworkRules = Objects.requireNonNull(virtualNetworkRules);
            return this;
        }
        public Builder virtualNetworkRules(VirtualNetworkRuleResponse... virtualNetworkRules) {
            return virtualNetworkRules(List.of(virtualNetworkRules));
        }        public GetAccountResult build() {
            return new GetAccountResult(accountId, computePolicies, creationTime, currentTier, dataLakeStoreAccounts, debugDataAccessLevel, defaultDataLakeStoreAccount, endpoint, firewallAllowAzureIps, firewallRules, firewallState, hiveMetastores, id, lastModifiedTime, location, maxActiveJobCountPerUser, maxDegreeOfParallelism, maxDegreeOfParallelismPerJob, maxJobCount, maxJobRunningTimeInMin, maxQueuedJobCountPerUser, minPriorityPerJob, name, newTier, provisioningState, publicDataLakeStoreAccounts, queryStoreRetention, state, storageAccounts, systemMaxDegreeOfParallelism, systemMaxJobCount, tags, type, virtualNetworkRules);
        }
    }
}
