package com.veera.gcpservicemapping.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
public class ServiceMappingEntity {
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private long id;
	    
	    @NotBlank(message = "Please fill App ID")
	    @Column(name = "appId")
	    private long appId;
	    
	    @NotBlank(message = "Please fill App Name")
	    @Column(name = "appName")
	    private String appName;
	    
	    @NotBlank(message = "Please fill PDO")
	    @Column(name = "pdo")
	    private String pdo;
	    
	    @NotBlank(message = "Please fill SLA")
	    @Column(name = "sla")
	    private String sla;
	    
	    @NotBlank(message = "Please fill Current State Tech Stack")
	    @Column(name = "currentStateTechStack")
	    private String currentStateTechStack;
	    
	    @NotBlank(message = "Please fill Current State DB")
	    @Column(name = "currentStateDb")
	    private String currentStateDb;
	    
	    @NotBlank(message = "Please fill Future State Tech Stack")
	    @Column(name = "futureStateTechStack")
	    private String futureStateTechStack;
	    
	    @NotBlank(message = "Please fill Migration RoadMap")
	    @Column(name = "migrationRoadMap")
	    private String migrationRoadMap;
	    
	    @NotBlank(message = "Please fill In Scope")
	    @Column(name = "inScope")
	    private String inScope;
	    
	    @NotBlank(message = "Please fill Architecture Type (interim or final)")
	    @Column(name = "architectureType")
	    private String architectureType;
	    
	    @NotBlank(message = "Please fill Cloud Run (yes or no)")
	    @Column(name = "cloudRun")
	    private String cloudRun;
	    
	    @NotBlank(message = "Please fill GCP Caas (yes or no)")
	    @Column(name = "gcpCaas")
	    private String gcpCaas;
	    
	    @NotBlank(message = "Please fill Onprem Caas (yes or no)")
	    @Column(name = "onpremCaas")
	    private String onpremCaas;
	    
	    @NotBlank(message = "Please fill External Load Balancer (yes or no)")
	    @Column(name = "externalLoadBalancer")
	    private String externalLoadBalancer;
	    
	    @NotBlank(message = "Please fill Internal Load Balancer (yes or no)")
	    @Column(name = "internalLoadBalancer")
	    private String internalLoadBalancer;
	    
	    @NotBlank(message = "Please fill APIGEE (yes or no)")
	    @Column(name = "apigee")
	    private String apigee;
	    
	    @NotBlank(message = "Please fill Cloud Armor (yes or no)")
	    @Column(name = "cloudArmor")
	    private String cloudArmor;
	    
	    @NotBlank(message = "Please fill Cloud DNS (yes or no)")
	    @Column(name = "cloudDns")
	    private String cloudDns;
	    
	    @NotBlank(message = "Please fill Compute Engine (yes or no)")
	    @Column(name = "computeEngine")
	    private String computeEngine;
	    
	    @NotBlank(message = "Please fill Cloud Function (yes or no)")
	    @Column(name = "cloudFunction")
	    private String cloudFunction;
	    
	    @NotBlank(message = "Please fill Cloud Storage (yes or no)")
	    @Column(name = "cloudStorage")
	    private String cloudStorage;
	    
	    @NotBlank(message = "Please fill Pub Sub (yes or no)")
	    @Column(name = "pubSub")
	    private String pubSub;
	    
	    @NotBlank(message = "Please fill CloudSQL MSSQL SE (yes or no)")
	    @Column(name = "cloudSQLMSSQLSE")
	    private String cloudSQLMSSQLSE;
	    
	    @NotBlank(message = "Please fill CloudSQL MSSQL EE (yes or no)")
	    @Column(name = "cloudSQLMSSQLEE")
	    private String cloudSQLMSSQLEE;
	    
	    @NotBlank(message = "Please fill CloudSQL PG (yes or no)")
	    @Column(name = "cloudSQLPG")
	    private String cloudSQLPG;
	    
	    @NotBlank(message = "Please fill Onprem Db (yes or no)")
	    @Column(name = "onpremDb")
	    private String onpremDb;
	    
	    @NotBlank(message = "Please fill BigQuery (yes or no)")
	    @Column(name = "bigQuery")
	    private String bigQuery;
	    
	    @NotBlank(message = "Please fill Cloud Scheduler (yes or no)")
	    @Column(name = "cloudScheduler")
	    private String cloudScheduler;
	    
	    @NotBlank(message = "Please fill memoryStore (yes or no)")
	    @Column(name = "memoryStore")
	    private String memoryStore;
	    
	    @NotBlank(message = "Please fill Monitoring (yes or no)")
	    @Column(name = "cloudMonitoring")
	    private String cloudMonitoring;
	    
	    @NotBlank(message = "Please fill Logging (yes or no)")
	    @Column(name = "cloudLogging")
	    private String cloudLogging;
	    
	    @NotBlank(message = "Please fill Secret Manager (yes or no)")
	    @Column(name = "secretManager")
	    private String secretManager;
	    
	    @NotBlank(message = "Please fill Fire Store (yes or no)")
	    @Column(name = "fireStore")
	    private String fireStore;
	    
	    @NotBlank(message = "Please fill Mongo DB (yes or no)")
	    @Column(name = "mongoDb")
	    private String mongoDb;
	    
	    @NotBlank(message = "Please fill Cloud Build DB (yes or no)")
	    @Column(name = "cloudBuild")
	    private String cloudBuild;
	    
	    @NotBlank(message = "Please fill ADFS (yes or no)")
	    @Column(name = "adfs")
	    private String adfs;
	    
	    @NotBlank(message = "Please fill Azure AD (yes or no)")
	    @Column(name = "azureAd")
	    private String azureAd;
	    
	    @NotBlank(message = "Please fill Deployment Topology (yes or no)")
	    @Column(name = "deploymentTopology")
	    private String deploymentTopology;
	    
	    @NotBlank(message = "Please fill Terraform IAC Pipeline (yes or no)")
	    @Column(name = "terraformIacPipeline")
	    private String terraformIacPipeline;
	    
	    @NotBlank(message = "Please fill App CICD Pipeline (yes or no)")
	    @Column(name = "appCiCdPipeline")
	    private String appCiCdPipeline;
	    
	    @NotBlank(message = "Please fill FOSSA (yes or no)")
	    @Column(name = "fossa")
	    private String fossa;
	    
	    @NotBlank(message = "Please fill Checkmarx (yes or no)")
	    @Column(name = "checkmarx")
	    private String checkmarx;
	    
	    @NotBlank(message = "Please fill Sonar Qube (yes or no)")
	    @Column(name = "sonarQube")
	    private String sonarQube;
	    
	    @NotBlank(message = "Please fill Cycode (yes or no)")
	    @Column(name = "cyCode")
	    private String cyCode;
	    
	    @NotBlank(message = "Please fill 42 Crunch (yes or no)")
	    @Column(name = "crunch_42")
	    private String crunch_42;
	    
	    @NotBlank(message = "Please fill automatedTesting (yes or no)")
	    @Column(name = "automatedTesting")
	    private String automatedTesting;
	    
	    @NotBlank(message = "Please fill SRE (yes or no)")
	    @Column(name = "sre")
	    private String sre;
	    
	    @NotBlank(message = "Please fill migrationScope (yes or no)")
	    @Column(name = "migrationScope")
	    private String migrationScope;
	    
	    @NotBlank(message = "Please fill migrationCategory (yes or no)")
	    @Column(name = "migrationCategory")
	    private String migrationCategory;
	    
	    @NotBlank(message = "Please fill Launch Date (DD-MMM-YYYY)")
	    @Column(name = "launchDate")
	    private String launchDate;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public long getAppId() {
			return appId;
		}

		public void setAppId(long appId) {
			this.appId = appId;
		}

		public String getAppName() {
			return appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getPdo() {
			return pdo;
		}

		public void setPdo(String pdo) {
			this.pdo = pdo;
		}

		public String getSla() {
			return sla;
		}

		public void setSla(String sla) {
			this.sla = sla;
		}

		public String getCurrentStateTechStack() {
			return currentStateTechStack;
		}

		public void setCurrentStateTechStack(String currentStateTechStack) {
			this.currentStateTechStack = currentStateTechStack;
		}

		public String getCurrentStateDb() {
			return currentStateDb;
		}

		public void setCurrentStateDb(String currentStateDb) {
			this.currentStateDb = currentStateDb;
		}

		public String getFutureStateTechStack() {
			return futureStateTechStack;
		}

		public void setFutureStateTechStack(String futureStateTechStack) {
			this.futureStateTechStack = futureStateTechStack;
		}

		public String getMigrationRoadMap() {
			return migrationRoadMap;
		}

		public void setMigrationRoadMap(String migrationRoadMap) {
			this.migrationRoadMap = migrationRoadMap;
		}

		public String getInScope() {
			return inScope;
		}

		public void setInScope(String inScope) {
			this.inScope = inScope;
		}

		public String getArchitectureType() {
			return architectureType;
		}

		public void setArchitectureType(String architectureType) {
			this.architectureType = architectureType;
		}

		public String getCloudRun() {
			return cloudRun;
		}

		public void setCloudRun(String cloudRun) {
			this.cloudRun = cloudRun;
		}

		public String getGcpCaas() {
			return gcpCaas;
		}

		public void setGcpCaas(String gcpCaas) {
			this.gcpCaas = gcpCaas;
		}

		public String getOnpremCaas() {
			return onpremCaas;
		}

		public void setOnpremCaas(String onpremCaas) {
			this.onpremCaas = onpremCaas;
		}

		public String getExternalLoadBalancer() {
			return externalLoadBalancer;
		}

		public void setExternalLoadBalancer(String externalLoadBalancer) {
			this.externalLoadBalancer = externalLoadBalancer;
		}

		public String getInternalLoadBalancer() {
			return internalLoadBalancer;
		}

		public void setInternalLoadBalancer(String internalLoadBalancer) {
			this.internalLoadBalancer = internalLoadBalancer;
		}

		public String getApigee() {
			return apigee;
		}

		public void setApigee(String apigee) {
			this.apigee = apigee;
		}

		public String getCloudArmor() {
			return cloudArmor;
		}

		public void setCloudArmor(String cloudArmor) {
			this.cloudArmor = cloudArmor;
		}

		public String getCloudDns() {
			return cloudDns;
		}

		public void setCloudDns(String cloudDns) {
			this.cloudDns = cloudDns;
		}

		public String getComputeEngine() {
			return computeEngine;
		}

		public void setComputeEngine(String computeEngine) {
			this.computeEngine = computeEngine;
		}

		public String getCloudFunction() {
			return cloudFunction;
		}

		public void setCloudFunction(String cloudFunction) {
			this.cloudFunction = cloudFunction;
		}

		public String getCloudStorage() {
			return cloudStorage;
		}

		public void setCloudStorage(String cloudStorage) {
			this.cloudStorage = cloudStorage;
		}

		public String getPubSub() {
			return pubSub;
		}

		public void setPubSub(String pubSub) {
			this.pubSub = pubSub;
		}

		public String getCloudSQLMSSQLSE() {
			return cloudSQLMSSQLSE;
		}

		public void setCloudSQLMSSQLSE(String cloudSQLMSSQLSE) {
			this.cloudSQLMSSQLSE = cloudSQLMSSQLSE;
		}

		public String getCloudSQLMSSQLEE() {
			return cloudSQLMSSQLEE;
		}

		public void setCloudSQLMSSQLEE(String cloudSQLMSSQLEE) {
			this.cloudSQLMSSQLEE = cloudSQLMSSQLEE;
		}

		public String getCloudSQLPG() {
			return cloudSQLPG;
		}

		public void setCloudSQLPG(String cloudSQLPG) {
			this.cloudSQLPG = cloudSQLPG;
		}

		public String getOnpremDb() {
			return onpremDb;
		}

		public void setOnpremDb(String onpremDb) {
			this.onpremDb = onpremDb;
		}

		public String getBigQuery() {
			return bigQuery;
		}

		public void setBigQuery(String bigQuery) {
			this.bigQuery = bigQuery;
		}

		public String getCloudScheduler() {
			return cloudScheduler;
		}

		public void setCloudScheduler(String cloudScheduler) {
			this.cloudScheduler = cloudScheduler;
		}

		public String getMemoryStore() {
			return memoryStore;
		}

		public void setMemoryStore(String memoryStore) {
			this.memoryStore = memoryStore;
		}

		public String getCloudMonitoring() {
			return cloudMonitoring;
		}

		public void setCloudMonitoring(String cloudMonitoring) {
			this.cloudMonitoring = cloudMonitoring;
		}

		public String getCloudLogging() {
			return cloudLogging;
		}

		public void setCloudLogging(String cloudLogging) {
			this.cloudLogging = cloudLogging;
		}

		public String getSecretManager() {
			return secretManager;
		}

		public void setSecretManager(String secretManager) {
			this.secretManager = secretManager;
		}

		public String getFireStore() {
			return fireStore;
		}

		public void setFireStore(String fireStore) {
			this.fireStore = fireStore;
		}

		public String getMongoDb() {
			return mongoDb;
		}

		public void setMongoDb(String mongoDb) {
			this.mongoDb = mongoDb;
		}

		public String getCloudBuild() {
			return cloudBuild;
		}

		public void setCloudBuild(String cloudBuild) {
			this.cloudBuild = cloudBuild;
		}

		public String getAdfs() {
			return adfs;
		}

		public void setAdfs(String adfs) {
			this.adfs = adfs;
		}

		public String getAzureAd() {
			return azureAd;
		}

		public void setAzureAd(String azureAd) {
			this.azureAd = azureAd;
		}

		public String getDeploymentTopology() {
			return deploymentTopology;
		}

		public void setDeploymentTopology(String deploymentTopology) {
			this.deploymentTopology = deploymentTopology;
		}

		public String getTerraformIacPipeline() {
			return terraformIacPipeline;
		}

		public void setTerraformIacPipeline(String terraformIacPipeline) {
			this.terraformIacPipeline = terraformIacPipeline;
		}

		public String getAppCiCdPipeline() {
			return appCiCdPipeline;
		}

		public void setAppCiCdPipeline(String appCiCdPipeline) {
			this.appCiCdPipeline = appCiCdPipeline;
		}

		public String getFossa() {
			return fossa;
		}

		public void setFossa(String fossa) {
			this.fossa = fossa;
		}

		public String getCheckmarx() {
			return checkmarx;
		}

		public void setCheckmarx(String checkmarx) {
			this.checkmarx = checkmarx;
		}

		public String getSonarQube() {
			return sonarQube;
		}

		public void setSonarQube(String sonarQube) {
			this.sonarQube = sonarQube;
		}

		public String getCyCode() {
			return cyCode;
		}

		public void setCyCode(String cyCode) {
			this.cyCode = cyCode;
		}

		public String getCrunch_42() {
			return crunch_42;
		}

		public void setCrunch_42(String crunch_42) {
			this.crunch_42 = crunch_42;
		}

		public String getAutomatedTesting() {
			return automatedTesting;
		}

		public void setAutomatedTesting(String automatedTesting) {
			this.automatedTesting = automatedTesting;
		}

		public String getSre() {
			return sre;
		}

		public void setSre(String sre) {
			this.sre = sre;
		}

		public String getMigrationScope() {
			return migrationScope;
		}

		public void setMigrationScope(String migrationScope) {
			this.migrationScope = migrationScope;
		}

		public String getMigrationCategory() {
			return migrationCategory;
		}

		public void setMigrationCategory(String migrationCategory) {
			this.migrationCategory = migrationCategory;
		}

		public String getLaunchDate() {
			return launchDate;
		}

		public void setLaunchDate(String launchDate) {
			this.launchDate = launchDate;
		}
	    
	    
	    
	
	    
	    

	    
}
